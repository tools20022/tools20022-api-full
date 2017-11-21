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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmAcquirer
 * CardPaymentEnvironment67.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmMerchantIdentification
 * CardPaymentEnvironment67.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmPOIIdentification
 * CardPaymentEnvironment67.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67#mmPOIComponent
 * CardPaymentEnvironment67.mmPOIComponent}</li>
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
 * "CardPaymentEnvironment67"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50
 * CardPaymentEnvironment50}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentEnvironment67", propOrder = {"acquirer", "merchantIdentification", "POIIdentification", "POIComponent"})
public class CardPaymentEnvironment67 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Acquirer4 acquirer;
	/**
	 * Acquirer involved in the card payment reconciliation.
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67
	 * CardPaymentEnvironment67}</li>
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
	 * definition} = "Acquirer involved in the card payment reconciliation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmAcquirer
	 * CardPaymentEnvironment50.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> CardPaymentEnvironment67.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer involved in the card payment reconciliation.";
			previousVersion_lazy = () -> CardPaymentEnvironment50.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Acquirer4.mmObject();
		}
	};
	protected GenericIdentification53 merchantIdentification;
	/**
	 * Identification of the merchant requesting the reconciliation.
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67
	 * CardPaymentEnvironment67}</li>
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
	 * definition} =
	 * "Identification of the merchant requesting the reconciliation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmMerchantIdentification
	 * CardPaymentEnvironment50.mmMerchantIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMerchantIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> CardPaymentEnvironment67.mmObject();
			isDerived = false;
			xmlTag = "MrchntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantIdentification";
			definition = "Identification of the merchant requesting the reconciliation.";
			previousVersion_lazy = () -> CardPaymentEnvironment50.mmMerchantIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification53.mmObject();
		}
	};
	protected GenericIdentification53 pOIIdentification;
	/**
	 * Identification of the POI (Point Of Interaction) requesting the
	 * reconciliation.
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67
	 * CardPaymentEnvironment67}</li>
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
	 * "Identification of the POI (Point Of Interaction) requesting the reconciliation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmPOIIdentification
	 * CardPaymentEnvironment50.mmPOIIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> CardPaymentEnvironment67.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the POI (Point Of Interaction) requesting the reconciliation.";
			previousVersion_lazy = () -> CardPaymentEnvironment50.mmPOIIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification53.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PointOfInteractionComponent7> pOIComponent;
	/**
	 * Data related to the components of the POI (Point Of Interaction) that
	 * have been performed the payment transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
	 * PointOfInteractionComponent7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment67
	 * CardPaymentEnvironment67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POICmpnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to the components of the POI (Point Of Interaction) that have been performed the payment transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment50#mmPOIComponent
	 * CardPaymentEnvironment50.mmPOIComponent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIComponent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentEnvironment67.mmObject();
			isDerived = false;
			xmlTag = "POICmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIComponent";
			definition = "Data related to the components of the POI (Point Of Interaction) that have been performed the payment transactions.";
			previousVersion_lazy = () -> CardPaymentEnvironment50.mmPOIComponent;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentEnvironment67.mmAcquirer, CardPaymentEnvironment67.mmMerchantIdentification, CardPaymentEnvironment67.mmPOIIdentification, CardPaymentEnvironment67.mmPOIComponent);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment67";
				definition = "Environment of the transaction.";
				previousVersion_lazy = () -> CardPaymentEnvironment50.mmObject();
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

	@XmlElement(name = "MrchntId")
	public GenericIdentification53 getMerchantIdentification() {
		return merchantIdentification;
	}

	public void setMerchantIdentification(com.tools20022.repository.msg.GenericIdentification53 merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
	}

	@XmlElement(name = "POIId")
	public GenericIdentification53 getPOIIdentification() {
		return pOIIdentification;
	}

	public void setPOIIdentification(com.tools20022.repository.msg.GenericIdentification53 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
	}

	@XmlElement(name = "POICmpnt")
	public List<PointOfInteractionComponent7> getPOIComponent() {
		return pOIComponent;
	}

	public void setPOIComponent(List<com.tools20022.repository.msg.PointOfInteractionComponent7> pOIComponent) {
		this.pOIComponent = pOIComponent;
	}
}