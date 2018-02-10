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
import com.tools20022.repository.choice.ChargeBasis2Choice;
import com.tools20022.repository.choice.ChargeType5Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money associated with a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmType Fee2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmBasis Fee2.mmBasis}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmStandardAmount
 * Fee2.mmStandardAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmStandardRate
 * Fee2.mmStandardRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmDiscountDetails
 * Fee2.mmDiscountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmAppliedAmount
 * Fee2.mmAppliedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmAppliedRate
 * Fee2.mmAppliedRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmNonStandardSLAReference
 * Fee2.mmNonStandardSLAReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmRecipientIdentification
 * Fee2.mmRecipientIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmInformativeIndicator
 * Fee2.mmInformativeIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAppliedAmountRule#forFee2
 * ConstraintAppliedAmountRule.forFee2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Fee2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money associated with a service."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Charge18
 * Charge18}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Fee2", propOrder = {"type", "basis", "standardAmount", "standardRate", "discountDetails", "appliedAmount", "appliedRate", "nonStandardSLAReference", "recipientIdentification", "informativeIndicator"})
public class Fee2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected ChargeType5Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ChargeType5Choice
	 * ChargeType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargeType
	 * Charges.mmChargeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
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
	 * definition} = "Type of fee (charge/commission)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} = {@linkplain com.tools20022.repository.msg.Fee1#mmType
	 * Fee1.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of fee (charge/commission).";
			previousVersion_lazy = () -> Fee1.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ChargeType5Choice.mmObject();
		}
	};
	@XmlElement(name = "Bsis")
	protected ChargeBasis2Choice basis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ChargeBasis2Choice
	 * ChargeBasis2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCalculationMethod
	 * Adjustment.mmCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
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
	 * definition} = "Method used to calculate the fee (charge/commission). "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fee1#mmBasis Fee1.mmBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmCalculationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "Bsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basis";
			definition = "Method used to calculate the fee (charge/commission). ";
			previousVersion_lazy = () -> Fee1.mmBasis;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ChargeBasis2Choice.mmObject();
		}
	};
	@XmlElement(name = "StdAmt")
	protected ActiveCurrencyAndAmount standardAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standard fee (charge/commission) amount as specified in the fund prospectus or agreed for the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fee1#mmStandardAmount
	 * Fee1.mmStandardAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandardAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "StdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardAmount";
			definition = "Standard fee (charge/commission) amount as specified in the fund prospectus or agreed for the account.";
			previousVersion_lazy = () -> Fee1.mmStandardAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "StdRate")
	protected PercentageRate standardRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standard fee (charge/commission) rate used to calculate the amount of the charge or fee, as specified in the fund prospectus or agreed for the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fee1#mmStandardRate
	 * Fee1.mmStandardRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandardRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "StdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardRate";
			definition = "Standard fee (charge/commission) rate used to calculate the amount of the charge or fee, as specified in the fund prospectus or agreed for the account.";
			previousVersion_lazy = () -> Fee1.mmStandardRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "DscntDtls")
	protected ChargeOrCommissionDiscount1 discountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1
	 * ChargeOrCommissionDiscount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DscntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Discount or waiver applied to the fee (charge/commission)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDiscountDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "DscntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountDetails";
			definition = "Discount or waiver applied to the fee (charge/commission).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ChargeOrCommissionDiscount1.mmObject();
		}
	};
	@XmlElement(name = "ApldAmt")
	protected ActiveCurrencyAndAmount appliedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fee (charge/commission) amount applied to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAppliedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "ApldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedAmount";
			definition = "Fee (charge/commission) amount applied to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ApldRate")
	protected PercentageRate appliedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApldRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final rate used to calculate the fee (charge/commission) amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAppliedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "ApldRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedRate";
			definition = "Final rate used to calculate the fee (charge/commission) amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "NonStdSLARef")
	protected Max35Text nonStandardSLAReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSLARef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSLAReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a sales agreement that overrides normal processing or the Service Level Agreement (SLA), such as a fee (charge/commission)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fee1#mmNonStandardSLAReference
	 * Fee1.mmNonStandardSLAReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardSLAReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "NonStdSLARef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSLAReference";
			definition = "Reference to a sales agreement that overrides normal processing or the Service Level Agreement (SLA), such as a fee (charge/commission).";
			previousVersion_lazy = () -> Fee1.mmNonStandardSLAReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RcptId")
	protected PartyIdentification113 recipientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
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
	 * "Party entitled to the amount of money resulting from a fee (charge/commission)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Fee1#mmRecipientIdentification
	 * Fee1.mmRecipientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipientIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Party entitled to the amount of money resulting from a fee (charge/commission).";
			previousVersion_lazy = () -> Fee1.mmRecipientIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification113.mmObject();
		}
	};
	@XmlElement(name = "InftvInd", required = true)
	protected YesNoIndicator informativeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InftvInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformativeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the information is provided for information purposes only. When the value is ‘false’ or ‘0’ the amount provided is taken into consideration in the transaction overhead. When the value is ‘true’ or ‘1’ the amount provided is not taken into consideration in the transaction overhead."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInformativeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Fee2.mmObject();
			isDerived = false;
			xmlTag = "InftvInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformativeIndicator";
			definition = "Indicates the information is provided for information purposes only. When the value is ‘false’ or ‘0’ the amount provided is taken into consideration in the transaction overhead. When the value is ‘true’ or ‘1’ the amount provided is not taken into consideration in the transaction overhead.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Fee2.mmType, com.tools20022.repository.msg.Fee2.mmBasis, com.tools20022.repository.msg.Fee2.mmStandardAmount,
						com.tools20022.repository.msg.Fee2.mmStandardRate, com.tools20022.repository.msg.Fee2.mmDiscountDetails, com.tools20022.repository.msg.Fee2.mmAppliedAmount, com.tools20022.repository.msg.Fee2.mmAppliedRate,
						com.tools20022.repository.msg.Fee2.mmNonStandardSLAReference, com.tools20022.repository.msg.Fee2.mmRecipientIdentification, com.tools20022.repository.msg.Fee2.mmInformativeIndicator);
				trace_lazy = () -> Charges.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAppliedAmountRule.forFee2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Fee2";
				definition = "Amount of money associated with a service.";
				previousVersion_lazy = () -> Charge18.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ChargeType5Choice getType() {
		return type;
	}

	public Fee2 setType(ChargeType5Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<ChargeBasis2Choice> getBasis() {
		return basis == null ? Optional.empty() : Optional.of(basis);
	}

	public Fee2 setBasis(ChargeBasis2Choice basis) {
		this.basis = basis;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getStandardAmount() {
		return standardAmount == null ? Optional.empty() : Optional.of(standardAmount);
	}

	public Fee2 setStandardAmount(ActiveCurrencyAndAmount standardAmount) {
		this.standardAmount = standardAmount;
		return this;
	}

	public Optional<PercentageRate> getStandardRate() {
		return standardRate == null ? Optional.empty() : Optional.of(standardRate);
	}

	public Fee2 setStandardRate(PercentageRate standardRate) {
		this.standardRate = standardRate;
		return this;
	}

	public Optional<ChargeOrCommissionDiscount1> getDiscountDetails() {
		return discountDetails == null ? Optional.empty() : Optional.of(discountDetails);
	}

	public Fee2 setDiscountDetails(com.tools20022.repository.msg.ChargeOrCommissionDiscount1 discountDetails) {
		this.discountDetails = discountDetails;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAppliedAmount() {
		return appliedAmount == null ? Optional.empty() : Optional.of(appliedAmount);
	}

	public Fee2 setAppliedAmount(ActiveCurrencyAndAmount appliedAmount) {
		this.appliedAmount = appliedAmount;
		return this;
	}

	public Optional<PercentageRate> getAppliedRate() {
		return appliedRate == null ? Optional.empty() : Optional.of(appliedRate);
	}

	public Fee2 setAppliedRate(PercentageRate appliedRate) {
		this.appliedRate = appliedRate;
		return this;
	}

	public Optional<Max35Text> getNonStandardSLAReference() {
		return nonStandardSLAReference == null ? Optional.empty() : Optional.of(nonStandardSLAReference);
	}

	public Fee2 setNonStandardSLAReference(Max35Text nonStandardSLAReference) {
		this.nonStandardSLAReference = nonStandardSLAReference;
		return this;
	}

	public Optional<PartyIdentification113> getRecipientIdentification() {
		return recipientIdentification == null ? Optional.empty() : Optional.of(recipientIdentification);
	}

	public Fee2 setRecipientIdentification(com.tools20022.repository.msg.PartyIdentification113 recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
		return this;
	}

	public YesNoIndicator getInformativeIndicator() {
		return informativeIndicator;
	}

	public Fee2 setInformativeIndicator(YesNoIndicator informativeIndicator) {
		this.informativeIndicator = Objects.requireNonNull(informativeIndicator);
		return this;
	}
}