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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AcquirerRole;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Acquirer4;
import com.tools20022.repository.msg.GenericIdentification53;
import com.tools20022.repository.msg.PointOfInteractionComponent6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmAcquirer
 * CardPaymentEnvironment50.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmMerchantIdentification
 * CardPaymentEnvironment50.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmPOIIdentification
 * CardPaymentEnvironment50.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmPOIComponent
 * CardPaymentEnvironment50.mmPOIComponent}</li>
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
 * "CardPaymentEnvironment50"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67
 * CardPaymentEnvironment67}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37
 * CardPaymentEnvironment37}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentEnvironment50", propOrder = {"acquirer", "merchantIdentification", "pOIIdentification", "pOIComponent"})
public class CardPaymentEnvironment50 {

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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50
	 * CardPaymentEnvironment50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer involved in the card payment reconciliation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmAcquirer
	 * CardPaymentEnvironment67.mmAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#mmAcquirer
	 * CardPaymentEnvironment37.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment50, Acquirer4> mmAcquirer = new MMMessageAssociationEnd<CardPaymentEnvironment50, Acquirer4>() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment50.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment reconciliation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment67.mmAcquirer);
			previousVersion_lazy = () -> CardPaymentEnvironment37.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Acquirer4.mmObject();
		}

		@Override
		public Acquirer4 getValue(CardPaymentEnvironment50 obj) {
			return obj.getAcquirer();
		}

		@Override
		public void setValue(CardPaymentEnvironment50 obj, Acquirer4 value) {
			obj.setAcquirer(value);
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50
	 * CardPaymentEnvironment50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the merchant requesting the reconciliation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmMerchantIdentification
	 * CardPaymentEnvironment67.mmMerchantIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#mmMerchantIdentification
	 * CardPaymentEnvironment37.mmMerchantIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment50, Optional<GenericIdentification53>> mmMerchantIdentification = new MMMessageAssociationEnd<CardPaymentEnvironment50, Optional<GenericIdentification53>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment50.mmObject();
			isDerived = false;
			xmlTag = "MrchntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantIdentification";
			definition = "Identification of the merchant requesting the reconciliation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment67.mmMerchantIdentification);
			previousVersion_lazy = () -> CardPaymentEnvironment37.mmMerchantIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification53.mmObject();
		}

		@Override
		public Optional<GenericIdentification53> getValue(CardPaymentEnvironment50 obj) {
			return obj.getMerchantIdentification();
		}

		@Override
		public void setValue(CardPaymentEnvironment50 obj, Optional<GenericIdentification53> value) {
			obj.setMerchantIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "POIId")
	protected GenericIdentification53 pOIIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50
	 * CardPaymentEnvironment50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI (Point Of Interaction) requesting the reconciliation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmPOIIdentification
	 * CardPaymentEnvironment67.mmPOIIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#mmPOIIdentification
	 * CardPaymentEnvironment37.mmPOIIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment50, Optional<GenericIdentification53>> mmPOIIdentification = new MMMessageAssociationEnd<CardPaymentEnvironment50, Optional<GenericIdentification53>>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment50.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the POI (Point Of Interaction) requesting the reconciliation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment67.mmPOIIdentification);
			previousVersion_lazy = () -> CardPaymentEnvironment37.mmPOIIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification53.mmObject();
		}

		@Override
		public Optional<GenericIdentification53> getValue(CardPaymentEnvironment50 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(CardPaymentEnvironment50 obj, Optional<GenericIdentification53> value) {
			obj.setPOIIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "POICmpnt")
	protected List<PointOfInteractionComponent6> pOIComponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6
	 * PointOfInteractionComponent6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50
	 * CardPaymentEnvironment50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POICmpnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to the components of the POI (Point Of Interaction) that have been performed the payment transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmPOIComponent
	 * CardPaymentEnvironment67.mmPOIComponent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment37#mmPOIComponent
	 * CardPaymentEnvironment37.mmPOIComponent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentEnvironment50, List<PointOfInteractionComponent6>> mmPOIComponent = new MMMessageAssociationEnd<CardPaymentEnvironment50, List<PointOfInteractionComponent6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment50.mmObject();
			isDerived = false;
			xmlTag = "POICmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIComponent";
			definition = "Data related to the components of the POI (Point Of Interaction) that have been performed the payment transactions.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment67.mmPOIComponent);
			previousVersion_lazy = () -> CardPaymentEnvironment37.mmPOIComponent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PointOfInteractionComponent6.mmObject();
		}

		@Override
		public List<PointOfInteractionComponent6> getValue(CardPaymentEnvironment50 obj) {
			return obj.getPOIComponent();
		}

		@Override
		public void setValue(CardPaymentEnvironment50 obj, List<PointOfInteractionComponent6> value) {
			obj.setPOIComponent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentEnvironment50.mmAcquirer, com.tools20022.repository.msg.CardPaymentEnvironment50.mmMerchantIdentification,
						com.tools20022.repository.msg.CardPaymentEnvironment50.mmPOIIdentification, com.tools20022.repository.msg.CardPaymentEnvironment50.mmPOIComponent);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment50";
				definition = "Environment of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment67.mmObject());
				previousVersion_lazy = () -> CardPaymentEnvironment37.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Acquirer4 getAcquirer() {
		return acquirer;
	}

	public CardPaymentEnvironment50 setAcquirer(Acquirer4 acquirer) {
		this.acquirer = Objects.requireNonNull(acquirer);
		return this;
	}

	public Optional<GenericIdentification53> getMerchantIdentification() {
		return merchantIdentification == null ? Optional.empty() : Optional.of(merchantIdentification);
	}

	public CardPaymentEnvironment50 setMerchantIdentification(GenericIdentification53 merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
		return this;
	}

	public Optional<GenericIdentification53> getPOIIdentification() {
		return pOIIdentification == null ? Optional.empty() : Optional.of(pOIIdentification);
	}

	public CardPaymentEnvironment50 setPOIIdentification(GenericIdentification53 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
		return this;
	}

	public List<PointOfInteractionComponent6> getPOIComponent() {
		return pOIComponent == null ? pOIComponent = new ArrayList<>() : pOIComponent;
	}

	public CardPaymentEnvironment50 setPOIComponent(List<PointOfInteractionComponent6> pOIComponent) {
		this.pOIComponent = Objects.requireNonNull(pOIComponent);
		return this;
	}
}