/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.AcquirerRole;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Acquirer4;
import com.tools20022.repository.msg.GenericIdentification32;
import com.tools20022.repository.msg.GenericIdentification53;
import com.tools20022.repository.msg.PointOfInteractionComponent7;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the diagnostic exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#mmAcquirer
 * CardPaymentEnvironment64.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#mmAcquirerAvailabilityRequested
 * CardPaymentEnvironment64.mmAcquirerAvailabilityRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#mmMerchantIdentification
 * CardPaymentEnvironment64.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#mmPOIIdentification
 * CardPaymentEnvironment64.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64#mmPOIComponent
 * CardPaymentEnvironment64.mmPOIComponent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentEnvironment64"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the diagnostic exchange."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71
 * CardPaymentEnvironment71}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55
 * CardPaymentEnvironment55}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentEnvironment64", propOrder = {"acquirer", "acquirerAvailabilityRequested", "merchantIdentification", "pOIIdentification", "pOIComponent"})
public class CardPaymentEnvironment64 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acqrr", required = true)
	protected Acquirer4 acquirer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer4 Acquirer4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcquirerRole AcquirerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64
	 * CardPaymentEnvironment64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer involved in the card payment transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71#mmAcquirer
	 * CardPaymentEnvironment71.mmAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#mmAcquirer
	 * CardPaymentEnvironment55.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment64, Acquirer4> mmAcquirer = new MMMessageAssociationEnd<CardPaymentEnvironment64, Acquirer4>() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment64.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment71.mmAcquirer);
			previousVersion_lazy = () -> CardPaymentEnvironment55.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Acquirer4.mmObject();
		}

		@Override
		public Acquirer4 getValue(CardPaymentEnvironment64 obj) {
			return obj.getAcquirer();
		}

		@Override
		public void setValue(CardPaymentEnvironment64 obj, Acquirer4 value) {
			obj.setAcquirer(value);
		}
	};
	@XmlElement(name = "AcqrrAvlbtyReqd")
	protected TrueFalseIndicator acquirerAvailabilityRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64
	 * CardPaymentEnvironment64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrAvlbtyReqd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerAvailabilityRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The availability of the acquirer to process transaction must be provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71#mmAcquirerAvailabilityRequested
	 * CardPaymentEnvironment71.mmAcquirerAvailabilityRequested}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#mmAcquirerAvailabilityRequested
	 * CardPaymentEnvironment55.mmAcquirerAvailabilityRequested}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentEnvironment64, Optional<TrueFalseIndicator>> mmAcquirerAvailabilityRequested = new MMMessageAttribute<CardPaymentEnvironment64, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment64.mmObject();
			isDerived = false;
			xmlTag = "AcqrrAvlbtyReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerAvailabilityRequested";
			definition = "The availability of the acquirer to process transaction must be provided.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment71.mmAcquirerAvailabilityRequested);
			previousVersion_lazy = () -> CardPaymentEnvironment55.mmAcquirerAvailabilityRequested;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(CardPaymentEnvironment64 obj) {
			return obj.getAcquirerAvailabilityRequested();
		}

		@Override
		public void setValue(CardPaymentEnvironment64 obj, Optional<TrueFalseIndicator> value) {
			obj.setAcquirerAvailabilityRequested(value.orElse(null));
		}
	};
	@XmlElement(name = "MrchntId")
	protected GenericIdentification53 merchantIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53
	 * GenericIdentification53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64
	 * CardPaymentEnvironment64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the merchant requesting the diagnostic."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71#mmMerchantIdentification
	 * CardPaymentEnvironment71.mmMerchantIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#mmMerchantIdentification
	 * CardPaymentEnvironment55.mmMerchantIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment64, Optional<GenericIdentification53>> mmMerchantIdentification = new MMMessageAssociationEnd<CardPaymentEnvironment64, Optional<GenericIdentification53>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment64.mmObject();
			isDerived = false;
			xmlTag = "MrchntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantIdentification";
			definition = "Identification of the merchant requesting the diagnostic.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment71.mmMerchantIdentification);
			previousVersion_lazy = () -> CardPaymentEnvironment55.mmMerchantIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification53.mmObject();
		}

		@Override
		public Optional<GenericIdentification53> getValue(CardPaymentEnvironment64 obj) {
			return obj.getMerchantIdentification();
		}

		@Override
		public void setValue(CardPaymentEnvironment64 obj, Optional<GenericIdentification53> value) {
			obj.setMerchantIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "POIId")
	protected GenericIdentification32 pOIIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64
	 * CardPaymentEnvironment64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI (Point Of Interaction) requesting the diagnostic."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71#mmPOIIdentification
	 * CardPaymentEnvironment71.mmPOIIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#mmPOIIdentification
	 * CardPaymentEnvironment55.mmPOIIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment64, Optional<GenericIdentification32>> mmPOIIdentification = new MMMessageAssociationEnd<CardPaymentEnvironment64, Optional<GenericIdentification32>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment64.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the POI (Point Of Interaction) requesting the diagnostic.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment71.mmPOIIdentification);
			previousVersion_lazy = () -> CardPaymentEnvironment55.mmPOIIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public Optional<GenericIdentification32> getValue(CardPaymentEnvironment64 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(CardPaymentEnvironment64 obj, Optional<GenericIdentification32> value) {
			obj.setPOIIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "POICmpnt")
	protected List<PointOfInteractionComponent7> pOIComponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
	 * PointOfInteractionComponent7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment64
	 * CardPaymentEnvironment64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POICmpnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to the components of the POI (Point Of Interaction) performing the payment transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71#mmPOIComponent
	 * CardPaymentEnvironment71.mmPOIComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment55#mmPOIComponent
	 * CardPaymentEnvironment55.mmPOIComponent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment64, List<PointOfInteractionComponent7>> mmPOIComponent = new MMMessageAssociationEnd<CardPaymentEnvironment64, List<PointOfInteractionComponent7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment64.mmObject();
			isDerived = false;
			xmlTag = "POICmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIComponent";
			definition = "Data related to the components of the POI (Point Of Interaction) performing the payment transactions.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment71.mmPOIComponent);
			previousVersion_lazy = () -> CardPaymentEnvironment55.mmPOIComponent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteractionComponent7.mmObject();
		}

		@Override
		public List<PointOfInteractionComponent7> getValue(CardPaymentEnvironment64 obj) {
			return obj.getPOIComponent();
		}

		@Override
		public void setValue(CardPaymentEnvironment64 obj, List<PointOfInteractionComponent7> value) {
			obj.setPOIComponent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment64.mmAcquirer, com.tools20022.repository.msg.CardPaymentEnvironment64.mmAcquirerAvailabilityRequested,
						com.tools20022.repository.msg.CardPaymentEnvironment64.mmMerchantIdentification, com.tools20022.repository.msg.CardPaymentEnvironment64.mmPOIIdentification,
						com.tools20022.repository.msg.CardPaymentEnvironment64.mmPOIComponent);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment64";
				definition = "Environment of the diagnostic exchange.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment71.mmObject());
				previousVersion_lazy = () -> CardPaymentEnvironment55.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Acquirer4 getAcquirer() {
		return acquirer;
	}

	public CardPaymentEnvironment64 setAcquirer(Acquirer4 acquirer) {
		this.acquirer = Objects.requireNonNull(acquirer);
		return this;
	}

	public Optional<TrueFalseIndicator> getAcquirerAvailabilityRequested() {
		return acquirerAvailabilityRequested == null ? Optional.empty() : Optional.of(acquirerAvailabilityRequested);
	}

	public CardPaymentEnvironment64 setAcquirerAvailabilityRequested(TrueFalseIndicator acquirerAvailabilityRequested) {
		this.acquirerAvailabilityRequested = acquirerAvailabilityRequested;
		return this;
	}

	public Optional<GenericIdentification53> getMerchantIdentification() {
		return merchantIdentification == null ? Optional.empty() : Optional.of(merchantIdentification);
	}

	public CardPaymentEnvironment64 setMerchantIdentification(GenericIdentification53 merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
		return this;
	}

	public Optional<GenericIdentification32> getPOIIdentification() {
		return pOIIdentification == null ? Optional.empty() : Optional.of(pOIIdentification);
	}

	public CardPaymentEnvironment64 setPOIIdentification(GenericIdentification32 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
		return this;
	}

	public List<PointOfInteractionComponent7> getPOIComponent() {
		return pOIComponent == null ? pOIComponent = new ArrayList<>() : pOIComponent;
	}

	public CardPaymentEnvironment64 setPOIComponent(List<PointOfInteractionComponent7> pOIComponent) {
		this.pOIComponent = Objects.requireNonNull(pOIComponent);
		return this;
	}
}