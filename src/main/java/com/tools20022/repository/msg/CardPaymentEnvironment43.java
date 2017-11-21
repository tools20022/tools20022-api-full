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
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#mmAcquirer
 * CardPaymentEnvironment43.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#mmAcquirerAvailable
 * CardPaymentEnvironment43.mmAcquirerAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#mmMerchantIdentification
 * CardPaymentEnvironment43.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43#mmPOIIdentification
 * CardPaymentEnvironment43.mmPOIIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentEnvironment43"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the diagnostic exchange."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31
 * CardPaymentEnvironment31}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentEnvironment43", propOrder = {"acquirer", "acquirerAvailable", "merchantIdentification", "POIIdentification"})
public class CardPaymentEnvironment43 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Acquirer4 acquirer;
	/**
	 * Acquirer involved in the card payment transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43
	 * CardPaymentEnvironment43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer involved in the card payment transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#mmAcquirer
	 * CardPaymentEnvironment31.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> CardPaymentEnvironment43.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment transaction.";
			previousVersion_lazy = () -> CardPaymentEnvironment31.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Acquirer4.mmObject();
		}
	};
	protected TrueFalseIndicator acquirerAvailable;
	/**
	 * Indicates if the acquirer is available to perform payment transactions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43
	 * CardPaymentEnvironment43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrAvlbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the acquirer is available to perform payment transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#mmAcquirerAvailable
	 * CardPaymentEnvironment31.mmAcquirerAvailable}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcquirerAvailable = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment43.mmObject();
			isDerived = false;
			xmlTag = "AcqrrAvlbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerAvailable";
			definition = "Indicates if the acquirer is available to perform payment transactions.";
			previousVersion_lazy = () -> CardPaymentEnvironment31.mmAcquirerAvailable;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected GenericIdentification53 merchantIdentification;
	/**
	 * Identification of the merchant requesting the diagnostic.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43
	 * CardPaymentEnvironment43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the merchant requesting the diagnostic."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#mmMerchantIdentification
	 * CardPaymentEnvironment31.mmMerchantIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMerchantIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> CardPaymentEnvironment43.mmObject();
			isDerived = false;
			xmlTag = "MrchntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantIdentification";
			definition = "Identification of the merchant requesting the diagnostic.";
			previousVersion_lazy = () -> CardPaymentEnvironment31.mmMerchantIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification53.mmObject();
		}
	};
	protected GenericIdentification32 pOIIdentification;
	/**
	 * Identification of the POI (Point Of Interaction) requesting the
	 * diagnostic.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment43
	 * CardPaymentEnvironment43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI (Point Of Interaction) requesting the diagnostic."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment31#mmPOIIdentification
	 * CardPaymentEnvironment31.mmPOIIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> CardPaymentEnvironment43.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the POI (Point Of Interaction) requesting the diagnostic.";
			previousVersion_lazy = () -> CardPaymentEnvironment31.mmPOIIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification32.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentEnvironment43.mmAcquirer, CardPaymentEnvironment43.mmAcquirerAvailable, CardPaymentEnvironment43.mmMerchantIdentification, CardPaymentEnvironment43.mmPOIIdentification);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment43";
				definition = "Environment of the diagnostic exchange.";
				previousVersion_lazy = () -> CardPaymentEnvironment31.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Acqrr", required = true)
	public Acquirer4 getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(com.tools20022.repository.msg.Acquirer4 acquirer) {
		this.acquirer = acquirer;
	}

	@XmlElement(name = "AcqrrAvlbl")
	public TrueFalseIndicator getAcquirerAvailable() {
		return acquirerAvailable;
	}

	public void setAcquirerAvailable(TrueFalseIndicator acquirerAvailable) {
		this.acquirerAvailable = acquirerAvailable;
	}

	@XmlElement(name = "MrchntId")
	public GenericIdentification53 getMerchantIdentification() {
		return merchantIdentification;
	}

	public void setMerchantIdentification(com.tools20022.repository.msg.GenericIdentification53 merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
	}

	@XmlElement(name = "POIId")
	public GenericIdentification32 getPOIIdentification() {
		return pOIIdentification;
	}

	public void setPOIIdentification(com.tools20022.repository.msg.GenericIdentification32 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
	}
}