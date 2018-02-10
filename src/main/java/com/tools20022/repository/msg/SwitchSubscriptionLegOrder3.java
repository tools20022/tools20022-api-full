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
import com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.IncomePreference1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Subscription leg, or switch-in, of a switch order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmLegIdentification
 * SwitchSubscriptionLegOrder3.mmLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmFinancialInstrumentDetails
 * SwitchSubscriptionLegOrder3.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmFinancialInstrumentQuantityChoice
 * SwitchSubscriptionLegOrder3.mmFinancialInstrumentQuantityChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmInvestmentAccountDetails
 * SwitchSubscriptionLegOrder3.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmIncomePreference
 * SwitchSubscriptionLegOrder3.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmRequestedSettlementCurrency
 * SwitchSubscriptionLegOrder3.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmRequestedNAVCurrency
 * SwitchSubscriptionLegOrder3.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmChargeDetails
 * SwitchSubscriptionLegOrder3.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmCommissionDetails
 * SwitchSubscriptionLegOrder3.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmSettlementAndCustodyDetails
 * SwitchSubscriptionLegOrder3.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmPhysicalDeliveryIndicator
 * SwitchSubscriptionLegOrder3.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmTaxDetails
 * SwitchSubscriptionLegOrder3.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmNonStandardSettlementInformation
 * SwitchSubscriptionLegOrder3.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmPhysicalDeliveryDetails
 * SwitchSubscriptionLegOrder3.mmPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmEqualisation
 * SwitchSubscriptionLegOrder3.mmEqualisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg
 * SwitchSubscriptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetailsRule#forSwitchSubscriptionLegOrder3
 * ConstraintPhysicalDeliveryDetailsRule.forSwitchSubscriptionLegOrder3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchSubscriptionLegOrder3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Subscription leg, or switch-in, of a switch order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6
 * SwitchSubscriptionLegOrder6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchSubscriptionLegOrder3", propOrder = {"legIdentification", "financialInstrumentDetails", "financialInstrumentQuantityChoice", "investmentAccountDetails", "incomePreference", "requestedSettlementCurrency",
		"requestedNAVCurrency", "chargeDetails", "commissionDetails", "settlementAndCustodyDetails", "physicalDeliveryIndicator", "taxDetails", "nonStandardSettlementInformation", "physicalDeliveryDetails", "equalisation"})
public class SwitchSubscriptionLegOrder3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LegId")
	protected Max35Text legIdentification;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for an instance of a leg within a switch."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmLegIdentification
	 * SwitchSubscriptionLegOrder6.mmLegIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "LegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIdentification";
			definition = "Unique technical identifier for an instance of a leg within a switch.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmLegIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument10 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument10
	 * FinancialInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund class related to an order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmFinancialInstrumentDetails
	 * SwitchSubscriptionLegOrder6.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class related to an order.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmFinancialInstrumentDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument10.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmQtyChc")
	protected FinancialInstrumentQuantity6Choice financialInstrumentQuantityChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice
	 * FinancialInstrumentQuantity6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmQtyChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantityChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment fund class related to an order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmFinancialInstrumentQuantityChoice
	 * SwitchSubscriptionLegOrder6.mmFinancialInstrumentQuantityChoice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentQuantityChoice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmQtyChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantityChoice";
			definition = "Investment fund class related to an order.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmFinancialInstrumentQuantityChoice);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity6Choice.mmObject();
		}
	};
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount21 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount21
	 * InvestmentAccount21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmInvestmentAccountDetails
	 * SwitchSubscriptionLegOrder6.mmInvestmentAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmInvestmentAccountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount21.mmObject();
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmIncomePreference
	 * SwitchSubscriptionLegOrder6.mmIncomePreference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmIncomePreference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}
	};
	@XmlElement(name = "ReqdSttlmCcy")
	protected ActiveCurrencyCode requestedSettlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedSettlementCurrency
	 * InvestmentFundOrder.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency requested for settlement of cash proceeds."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmRequestedSettlementCurrency
	 * SwitchSubscriptionLegOrder6.mmRequestedSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmRequestedSettlementCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "ReqdNAVCcy")
	protected ActiveOrHistoricCurrencyCode requestedNAVCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
	 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdNAVCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmRequestedNAVCurrency
	 * SwitchSubscriptionLegOrder6.mmRequestedNAVCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedNAVCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "ReqdNAVCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmRequestedNAVCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "ChrgDtls")
	protected List<com.tools20022.repository.msg.Charge17> chargeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge17 Charge17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money associated with a service."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Amount of money associated with a service.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge17.mmObject();
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<com.tools20022.repository.msg.Commission10> commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission10
	 * Commission10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission linked to the execution of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission linked to the execution of an investment fund order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission10.mmObject();
		}
	};
	@XmlElement(name = "SttlmAndCtdyDtls")
	protected FundSettlementParameters4 settlementAndCustodyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4
	 * FundSettlementParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
	 * SecuritiesTransfer.mmRelatedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAndCtdyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAndCustodyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters used to execute the settlement of an investment fund order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmSettlementAndCustodyDetails
	 * SwitchSubscriptionLegOrder6.mmSettlementAndCustodyDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAndCustodyDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmRelatedSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmSettlementAndCustodyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters4.mmObject();
		}
	};
	@XmlElement(name = "PhysDlvryInd", required = true)
	protected YesNoIndicator physicalDeliveryIndicator;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmPhysicalDeliveryIndicator
	 * SwitchSubscriptionLegOrder6.mmPhysicalDeliveryIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhysicalDeliveryIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmPhysicalDeliveryIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "TaxDtls")
	protected List<com.tools20022.repository.msg.Tax16> taxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax16 Tax16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
	 * InvestmentFundTransaction.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax applicable to an investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Tax applicable to an investment fund order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Tax16.mmObject();
		}
	};
	@XmlElement(name = "NonStdSttlmInf")
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmNonStandardSettlementInformation
	 * SwitchSubscriptionLegOrder6.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardSettlementInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmNonStandardSettlementInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "PhysDlvryDtls")
	protected NameAndAddress4 physicalDeliveryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress4
	 * NameAndAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
	 * PhysicalDelivery.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to physical delivery of the securities."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmPhysicalDeliveryDetails
	 * SwitchSubscriptionLegOrder6.mmPhysicalDeliveryDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPhysicalDeliveryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Information related to physical delivery of the securities.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmPhysicalDeliveryDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress4.mmObject();
		}
	};
	@XmlElement(name = "Equlstn")
	protected Equalisation1 equalisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Equalisation1
	 * Equalisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
	 * InvestmentFundClass.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
	 * SwitchSubscriptionLegOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Equlstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmEqualisation
	 * SwitchSubscriptionLegOrder6.mmEqualisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEqualisation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmEqualisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmObject();
			isDerived = false;
			xmlTag = "Equlstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmEqualisation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Equalisation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmLegIdentification, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmFinancialInstrumentQuantityChoice, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmIncomePreference, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmRequestedSettlementCurrency,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmRequestedNAVCurrency, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmChargeDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmCommissionDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmSettlementAndCustodyDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmPhysicalDeliveryIndicator, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmTaxDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmPhysicalDeliveryDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.mmEqualisation);
				trace_lazy = () -> SwitchSubscriptionLeg.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetailsRule.forSwitchSubscriptionLegOrder3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchSubscriptionLegOrder3";
				definition = "Subscription leg, or switch-in, of a switch order.";
				nextVersions_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getLegIdentification() {
		return legIdentification == null ? Optional.empty() : Optional.of(legIdentification);
	}

	public SwitchSubscriptionLegOrder3 setLegIdentification(Max35Text legIdentification) {
		this.legIdentification = legIdentification;
		return this;
	}

	public FinancialInstrument10 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public SwitchSubscriptionLegOrder3 setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument10 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<FinancialInstrumentQuantity6Choice> getFinancialInstrumentQuantityChoice() {
		return financialInstrumentQuantityChoice == null ? Optional.empty() : Optional.of(financialInstrumentQuantityChoice);
	}

	public SwitchSubscriptionLegOrder3 setFinancialInstrumentQuantityChoice(FinancialInstrumentQuantity6Choice financialInstrumentQuantityChoice) {
		this.financialInstrumentQuantityChoice = financialInstrumentQuantityChoice;
		return this;
	}

	public Optional<InvestmentAccount21> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public SwitchSubscriptionLegOrder3 setInvestmentAccountDetails(com.tools20022.repository.msg.InvestmentAccount21 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public SwitchSubscriptionLegOrder3 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<ActiveCurrencyCode> getRequestedSettlementCurrency() {
		return requestedSettlementCurrency == null ? Optional.empty() : Optional.of(requestedSettlementCurrency);
	}

	public SwitchSubscriptionLegOrder3 setRequestedSettlementCurrency(ActiveCurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getRequestedNAVCurrency() {
		return requestedNAVCurrency == null ? Optional.empty() : Optional.of(requestedNAVCurrency);
	}

	public SwitchSubscriptionLegOrder3 setRequestedNAVCurrency(ActiveOrHistoricCurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
		return this;
	}

	public List<Charge17> getChargeDetails() {
		return chargeDetails == null ? chargeDetails = new ArrayList<>() : chargeDetails;
	}

	public SwitchSubscriptionLegOrder3 setChargeDetails(List<com.tools20022.repository.msg.Charge17> chargeDetails) {
		this.chargeDetails = Objects.requireNonNull(chargeDetails);
		return this;
	}

	public List<Commission10> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public SwitchSubscriptionLegOrder3 setCommissionDetails(List<com.tools20022.repository.msg.Commission10> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}

	public Optional<FundSettlementParameters4> getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails == null ? Optional.empty() : Optional.of(settlementAndCustodyDetails);
	}

	public SwitchSubscriptionLegOrder3 setSettlementAndCustodyDetails(com.tools20022.repository.msg.FundSettlementParameters4 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
		return this;
	}

	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public SwitchSubscriptionLegOrder3 setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = Objects.requireNonNull(physicalDeliveryIndicator);
		return this;
	}

	public List<Tax16> getTaxDetails() {
		return taxDetails == null ? taxDetails = new ArrayList<>() : taxDetails;
	}

	public SwitchSubscriptionLegOrder3 setTaxDetails(List<com.tools20022.repository.msg.Tax16> taxDetails) {
		this.taxDetails = Objects.requireNonNull(taxDetails);
		return this;
	}

	public Optional<Max350Text> getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation == null ? Optional.empty() : Optional.of(nonStandardSettlementInformation);
	}

	public SwitchSubscriptionLegOrder3 setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
		return this;
	}

	public Optional<NameAndAddress4> getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails == null ? Optional.empty() : Optional.of(physicalDeliveryDetails);
	}

	public SwitchSubscriptionLegOrder3 setPhysicalDeliveryDetails(com.tools20022.repository.msg.NameAndAddress4 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
		return this;
	}

	public Optional<Equalisation1> getEqualisation() {
		return equalisation == null ? Optional.empty() : Optional.of(equalisation);
	}

	public SwitchSubscriptionLegOrder3 setEqualisation(com.tools20022.repository.msg.Equalisation1 equalisation) {
		this.equalisation = equalisation;
		return this;
	}
}