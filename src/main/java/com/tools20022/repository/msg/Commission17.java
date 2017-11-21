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
import com.tools20022.repository.choice.CommissionBasis1Choice;
import com.tools20022.repository.choice.CommissionType3Choice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money due to a party as compensation for a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Commission17#mmType
 * Commission17.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission17#mmBasis
 * Commission17.mmBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission17#mmAmount
 * Commission17.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Commission17#mmRecipientIdentification
 * Commission17.mmRecipientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Commission17#mmCommercialAgreementReference
 * Commission17.mmCommercialAgreementReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission17#mmWaivingDetails
 * Commission17.mmWaivingDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
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
 * "Commission17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money due to a party as compensation for a service."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Commission22 Commission22}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Commission12
 * Commission12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Commission17", propOrder = {"type", "basis", "amount", "recipientIdentification", "commercialAgreementReference", "waivingDetails"})
public class Commission17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CommissionType3Choice type;
	/**
	 * Service for which the commission is asked or paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CommissionType3Choice
	 * CommissionType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionType
	 * Commission.mmCommissionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission17 Commission17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Service for which the commission is asked or paid."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission22#mmType
	 * Commission22.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionType;
			componentContext_lazy = () -> Commission17.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Service for which the commission is asked or paid.";
			nextVersions_lazy = () -> Arrays.asList(Commission22.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CommissionType3Choice.mmObject();
		}
	};
	protected CommissionBasis1Choice basis;
	/**
	 * Basis upon which a commission is charged, for example, flat fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CommissionBasis1Choice
	 * CommissionBasis1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmBasis
	 * Commission.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission17 Commission17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis upon which a commission is charged, for example, flat fee."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission22#mmBasis
	 * Commission22.mmBasis}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBasis = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commission.mmBasis;
			componentContext_lazy = () -> Commission17.mmObject();
			isDerived = false;
			xmlTag = "Bsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basis";
			definition = "Basis upon which a commission is charged, for example, flat fee.";
			nextVersions_lazy = () -> Arrays.asList(Commission22.mmBasis);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CommissionBasis1Choice.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * Commission expressed as an amount of money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission17 Commission17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission expressed as an amount of money."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission22#mmAmount
	 * Commission22.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Commission12#mmAmount
	 * Commission12.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> Commission17.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Commission expressed as an amount of money.";
			nextVersions_lazy = () -> Arrays.asList(Commission22.mmAmount);
			previousVersion_lazy = () -> Commission12.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected PartyIdentification2Choice recipientIdentification;
	/**
	 * Party entitled to the amount of money resulting from a commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission17 Commission17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party entitled to the amount of money resulting from a commission."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission22#mmRecipientIdentification
	 * Commission22.mmRecipientIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Commission12#mmRecipientIdentification
	 * Commission12.mmRecipientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipientIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Commission17.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Party entitled to the amount of money resulting from a commission.";
			nextVersions_lazy = () -> Arrays.asList(Commission22.mmRecipientIdentification);
			previousVersion_lazy = () -> Commission12.mmRecipientIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected Max35Text commercialAgreementReference;
	/**
	 * Reference to the agreement established between the fund and another
	 * party. This element, amongst others, defines the conditions of the
	 * commissions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommercialAgreementReference
	 * Commission.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission17 Commission17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclAgrmtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialAgreementReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission22#mmCommercialAgreementReference
	 * Commission22.mmCommercialAgreementReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Commission12#mmCommercialAgreementReference
	 * Commission12.mmCommercialAgreementReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommercialAgreementReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommercialAgreementReference;
			componentContext_lazy = () -> Commission17.mmObject();
			isDerived = false;
			xmlTag = "ComrclAgrmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialAgreementReference";
			definition = "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions.";
			nextVersions_lazy = () -> Arrays.asList(Commission22.mmCommercialAgreementReference);
			previousVersion_lazy = () -> Commission12.mmCommercialAgreementReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CommissionWaiver4 waivingDetails;
	/**
	 * Voluntary non-enforcement of the right to part of a commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommissionWaiver4
	 * CommissionWaiver4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionWaiving
	 * Commission.mmCommissionWaiving}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission17 Commission17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WvgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaivingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Voluntary non-enforcement of the right to part of a commission."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission22#mmWaivingDetails
	 * Commission22.mmWaivingDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWaivingDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionWaiving;
			componentContext_lazy = () -> Commission17.mmObject();
			isDerived = false;
			xmlTag = "WvgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaivingDetails";
			definition = "Voluntary non-enforcement of the right to part of a commission.";
			nextVersions_lazy = () -> Arrays.asList(Commission22.mmWaivingDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommissionWaiver4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Commission17.mmType, Commission17.mmBasis, Commission17.mmAmount, Commission17.mmRecipientIdentification, Commission17.mmCommercialAgreementReference, Commission17.mmWaivingDetails);
				trace_lazy = () -> Commission.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Commission17";
				definition = "Amount of money due to a party as compensation for a service.";
				nextVersions_lazy = () -> Arrays.asList(Commission22.mmObject());
				previousVersion_lazy = () -> Commission12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public CommissionType3Choice getType() {
		return type;
	}

	public void setType(CommissionType3Choice type) {
		this.type = type;
	}

	@XmlElement(name = "Bsis", required = true)
	public CommissionBasis1Choice getBasis() {
		return basis;
	}

	public void setBasis(CommissionBasis1Choice basis) {
		this.basis = basis;
	}

	@XmlElement(name = "Amt", required = true)
	public ActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "RcptId")
	public PartyIdentification2Choice getRecipientIdentification() {
		return recipientIdentification;
	}

	public void setRecipientIdentification(PartyIdentification2Choice recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
	}

	@XmlElement(name = "ComrclAgrmtRef")
	public Max35Text getCommercialAgreementReference() {
		return commercialAgreementReference;
	}

	public void setCommercialAgreementReference(Max35Text commercialAgreementReference) {
		this.commercialAgreementReference = commercialAgreementReference;
	}

	@XmlElement(name = "WvgDtls")
	public CommissionWaiver4 getWaivingDetails() {
		return waivingDetails;
	}

	public void setWaivingDetails(com.tools20022.repository.msg.CommissionWaiver4 waivingDetails) {
		this.waivingDetails = waivingDetails;
	}
}