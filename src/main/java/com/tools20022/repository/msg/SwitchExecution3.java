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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.setr.SwitchOrderConfirmationV02;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Execution of a switch order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#CashInOrCashOutRule
 * SwitchExecution3.CashInOrCashOutRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmOrderDateTime
 * SwitchExecution3.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmDealReference
 * SwitchExecution3.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmOrderReference
 * SwitchExecution3.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmInvestmentAccountDetails
 * SwitchExecution3.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmTotalRedemptionAmount
 * SwitchExecution3.mmTotalRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmTotalSubscriptionAmount
 * SwitchExecution3.mmTotalSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmAdditionalCashIn
 * SwitchExecution3.mmAdditionalCashIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmResultingCashOut
 * SwitchExecution3.mmResultingCashOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmRedemptionLegDetails
 * SwitchExecution3.mmRedemptionLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmSubscriptionLegDetails
 * SwitchExecution3.mmSubscriptionLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmCashSettlementDetails
 * SwitchExecution3.mmCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmForeignExchangeDetails
 * SwitchExecution3.mmForeignExchangeDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SwitchExecution
 * SwitchExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV02#mmSwitchExecutionDetails
 * SwitchOrderConfirmationV02.mmSwitchExecutionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchExecution3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a switch order."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchExecution3", propOrder = {"orderDateTime", "dealReference", "orderReference", "investmentAccountDetails", "totalRedemptionAmount", "totalSubscriptionAmount", "additionalCashIn", "resultingCashOut",
		"redemptionLegDetails", "subscriptionLegDetails", "cashSettlementDetails", "foreignExchangeDetails"})
public class SwitchExecution3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrdrDtTm")
	protected ISODateTime orderDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
	 * InvestmentFundOrder.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the order was placed by the investor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchExecution3, Optional<ISODateTime>> mmOrderDateTime = new MMMessageAttribute<SwitchExecution3, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(SwitchExecution3 obj) {
			return obj.getOrderDateTime();
		}

		@Override
		public void setValue(SwitchExecution3 obj, Optional<ISODateTime> value) {
			obj.setOrderDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "DealRef", required = true)
	protected Max35Text dealReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
	 * InvestmentFundOrderExecution.mmDealIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order execution, as assigned by a confirming party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchExecution3, Max35Text> mmDealReference = new MMMessageAttribute<SwitchExecution3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmDealIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SwitchExecution3 obj) {
			return obj.getDealReference();
		}

		@Override
		public void setValue(SwitchExecution3 obj, Max35Text value) {
			obj.setDealReference(value);
		}
	};
	@XmlElement(name = "OrdrRef", required = true)
	protected Max35Text orderReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order, as assigned by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchExecution3, Max35Text> mmOrderReference = new MMMessageAttribute<SwitchExecution3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SwitchExecution3 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(SwitchExecution3 obj, Max35Text value) {
			obj.setOrderReference(value);
		}
	};
	@XmlElement(name = "InvstmtAcctDtls", required = true)
	protected InvestmentAccount13 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount13
	 * InvestmentAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchExecution3, InvestmentAccount13> mmInvestmentAccountDetails = new MMMessageAssociationEnd<SwitchExecution3, InvestmentAccount13>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount13.mmObject();
		}

		@Override
		public InvestmentAccount13 getValue(SwitchExecution3 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(SwitchExecution3 obj, InvestmentAccount13 value) {
			obj.setInvestmentAccountDetails(value);
		}
	};
	@XmlElement(name = "TtlRedAmt")
	protected ActiveCurrencyAndAmount totalRedemptionAmount;
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
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmTotalRedemptionAmount
	 * SwitchOrder.mmTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlRedAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to determine the quantity of investment fund units to be redeemed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchExecution3, Optional<ActiveCurrencyAndAmount>> mmTotalRedemptionAmount = new MMMessageAttribute<SwitchExecution3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SwitchOrder.mmTotalRedemptionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "TtlRedAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRedemptionAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be redeemed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SwitchExecution3 obj) {
			return obj.getTotalRedemptionAmount();
		}

		@Override
		public void setValue(SwitchExecution3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalRedemptionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlSbcptAmt")
	protected ActiveCurrencyAndAmount totalSubscriptionAmount;
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
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmTotalSubscriptionAmount
	 * SwitchOrder.mmTotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlSbcptAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to determine the quantity of investment fund units to be subscribed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchExecution3, Optional<ActiveCurrencyAndAmount>> mmTotalSubscriptionAmount = new MMMessageAttribute<SwitchExecution3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SwitchOrder.mmTotalSubscriptionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "TtlSbcptAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSubscriptionAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SwitchExecution3 obj) {
			return obj.getTotalSubscriptionAmount();
		}

		@Override
		public void setValue(SwitchExecution3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalSubscriptionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlCshIn")
	protected ActiveCurrencyAndAmount additionalCashIn;
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
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmAdditionalCashIn
	 * SwitchOrder.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCshIn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCashIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount of money paid by the investor in addition to the switch redemption amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchExecution3, Optional<ActiveCurrencyAndAmount>> mmAdditionalCashIn = new MMMessageAttribute<SwitchExecution3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SwitchOrder.mmAdditionalCashIn;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "AddtlCshIn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCashIn";
			definition = "Additional amount of money paid by the investor in addition to the switch redemption amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SwitchExecution3 obj) {
			return obj.getAdditionalCashIn();
		}

		@Override
		public void setValue(SwitchExecution3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAdditionalCashIn(value.orElse(null));
		}
	};
	@XmlElement(name = "RsltgCshOut")
	protected ActiveCurrencyAndAmount resultingCashOut;
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
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmResultingCashOut
	 * SwitchOrder.mmResultingCashOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltgCshOut"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingCashOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from a switch-out, that is not reinvested in another investment fund, and is repaid to the investor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchExecution3, Optional<ActiveCurrencyAndAmount>> mmResultingCashOut = new MMMessageAttribute<SwitchExecution3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SwitchOrder.mmResultingCashOut;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "RsltgCshOut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultingCashOut";
			definition = "Amount of money that results from a switch-out, that is not reinvested in another investment fund, and is repaid to the investor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SwitchExecution3 obj) {
			return obj.getResultingCashOut();
		}

		@Override
		public void setValue(SwitchExecution3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setResultingCashOut(value.orElse(null));
		}
	};
	@XmlElement(name = "RedLegDtls", required = true)
	protected List<SwitchRedemptionLegExecution2> redemptionLegDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2
	 * SwitchRedemptionLegExecution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmRedemptionLeg
	 * SwitchExecution.mmRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedLegDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionLegDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption leg of a switch order execution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchExecution3, List<SwitchRedemptionLegExecution2>> mmRedemptionLegDetails = new MMMessageAssociationEnd<SwitchExecution3, List<SwitchRedemptionLegExecution2>>() {
		{
			businessElementTrace_lazy = () -> SwitchExecution.mmRedemptionLeg;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "RedLegDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionLegDetails";
			definition = "Redemption leg of a switch order execution.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SwitchRedemptionLegExecution2.mmObject();
		}

		@Override
		public List<SwitchRedemptionLegExecution2> getValue(SwitchExecution3 obj) {
			return obj.getRedemptionLegDetails();
		}

		@Override
		public void setValue(SwitchExecution3 obj, List<SwitchRedemptionLegExecution2> value) {
			obj.setRedemptionLegDetails(value);
		}
	};
	@XmlElement(name = "SbcptLegDtls", required = true)
	protected List<SwitchSubscriptionLegExecution2> subscriptionLegDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2
	 * SwitchSubscriptionLegExecution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmSubscriptionLeg
	 * SwitchExecution.mmSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptLegDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionLegDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Subscription leg of a switch order execution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchExecution3, List<SwitchSubscriptionLegExecution2>> mmSubscriptionLegDetails = new MMMessageAssociationEnd<SwitchExecution3, List<SwitchSubscriptionLegExecution2>>() {
		{
			businessElementTrace_lazy = () -> SwitchExecution.mmSubscriptionLeg;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "SbcptLegDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionLegDetails";
			definition = "Subscription leg of a switch order execution.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SwitchSubscriptionLegExecution2.mmObject();
		}

		@Override
		public List<SwitchSubscriptionLegExecution2> getValue(SwitchExecution3 obj) {
			return obj.getSubscriptionLegDetails();
		}

		@Override
		public void setValue(SwitchExecution3 obj, List<SwitchSubscriptionLegExecution2> value) {
			obj.setSubscriptionLegDetails(value);
		}
	};
	@XmlElement(name = "CshSttlmDtls")
	protected PaymentTransaction14 cashSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction14
	 * PaymentTransaction14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment transaction resulting from the investment fund order execution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchExecution3, Optional<PaymentTransaction14>> mmCashSettlementDetails = new MMMessageAssociationEnd<SwitchExecution3, Optional<PaymentTransaction14>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDetails";
			definition = "Payment transaction resulting from the investment fund order execution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction14.mmObject();
		}

		@Override
		public Optional<PaymentTransaction14> getValue(SwitchExecution3 obj) {
			return obj.getCashSettlementDetails();
		}

		@Override
		public void setValue(SwitchExecution3 obj, Optional<PaymentTransaction14> value) {
			obj.setCashSettlementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "FXDtls")
	protected List<ForeignExchangeTerms4> foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4
	 * ForeignExchangeTerms4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency exchange related to the execution of an investment fund order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchExecution3, List<ForeignExchangeTerms4>> mmForeignExchangeDetails = new MMMessageAssociationEnd<SwitchExecution3, List<ForeignExchangeTerms4>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Currency exchange related to the execution of an investment fund order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms4.mmObject();
		}

		@Override
		public List<ForeignExchangeTerms4> getValue(SwitchExecution3 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(SwitchExecution3 obj, List<ForeignExchangeTerms4> value) {
			obj.setForeignExchangeDetails(value);
		}
	};
	/**
	 * Either AdditionalCashIn or ResultingCashOut may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3
	 * SwitchExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmAdditionalCashIn
	 * SwitchExecution3.mmAdditionalCashIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmResultingCashOut
	 * SwitchExecution3.mmResultingCashOut}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInOrCashOutRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either AdditionalCashIn or ResultingCashOut may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor CashInOrCashOutRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInOrCashOutRule";
			definition = "Either AdditionalCashIn or ResultingCashOut may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.SwitchExecution3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchExecution3.mmAdditionalCashIn, com.tools20022.repository.msg.SwitchExecution3.mmResultingCashOut);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchExecution3.mmOrderDateTime, com.tools20022.repository.msg.SwitchExecution3.mmDealReference,
						com.tools20022.repository.msg.SwitchExecution3.mmOrderReference, com.tools20022.repository.msg.SwitchExecution3.mmInvestmentAccountDetails, com.tools20022.repository.msg.SwitchExecution3.mmTotalRedemptionAmount,
						com.tools20022.repository.msg.SwitchExecution3.mmTotalSubscriptionAmount, com.tools20022.repository.msg.SwitchExecution3.mmAdditionalCashIn, com.tools20022.repository.msg.SwitchExecution3.mmResultingCashOut,
						com.tools20022.repository.msg.SwitchExecution3.mmRedemptionLegDetails, com.tools20022.repository.msg.SwitchExecution3.mmSubscriptionLegDetails, com.tools20022.repository.msg.SwitchExecution3.mmCashSettlementDetails,
						com.tools20022.repository.msg.SwitchExecution3.mmForeignExchangeDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(SwitchOrderConfirmationV02.mmSwitchExecutionDetails);
				trace_lazy = () -> SwitchExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SwitchExecution3";
				definition = "Execution of a switch order.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchExecution3.CashInOrCashOutRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODateTime> getOrderDateTime() {
		return orderDateTime == null ? Optional.empty() : Optional.of(orderDateTime);
	}

	public SwitchExecution3 setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
		return this;
	}

	public Max35Text getDealReference() {
		return dealReference;
	}

	public SwitchExecution3 setDealReference(Max35Text dealReference) {
		this.dealReference = Objects.requireNonNull(dealReference);
		return this;
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public SwitchExecution3 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public InvestmentAccount13 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public SwitchExecution3 setInvestmentAccountDetails(InvestmentAccount13 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalRedemptionAmount() {
		return totalRedemptionAmount == null ? Optional.empty() : Optional.of(totalRedemptionAmount);
	}

	public SwitchExecution3 setTotalRedemptionAmount(ActiveCurrencyAndAmount totalRedemptionAmount) {
		this.totalRedemptionAmount = totalRedemptionAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalSubscriptionAmount() {
		return totalSubscriptionAmount == null ? Optional.empty() : Optional.of(totalSubscriptionAmount);
	}

	public SwitchExecution3 setTotalSubscriptionAmount(ActiveCurrencyAndAmount totalSubscriptionAmount) {
		this.totalSubscriptionAmount = totalSubscriptionAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAdditionalCashIn() {
		return additionalCashIn == null ? Optional.empty() : Optional.of(additionalCashIn);
	}

	public SwitchExecution3 setAdditionalCashIn(ActiveCurrencyAndAmount additionalCashIn) {
		this.additionalCashIn = additionalCashIn;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getResultingCashOut() {
		return resultingCashOut == null ? Optional.empty() : Optional.of(resultingCashOut);
	}

	public SwitchExecution3 setResultingCashOut(ActiveCurrencyAndAmount resultingCashOut) {
		this.resultingCashOut = resultingCashOut;
		return this;
	}

	public List<SwitchRedemptionLegExecution2> getRedemptionLegDetails() {
		return redemptionLegDetails == null ? redemptionLegDetails = new ArrayList<>() : redemptionLegDetails;
	}

	public SwitchExecution3 setRedemptionLegDetails(List<SwitchRedemptionLegExecution2> redemptionLegDetails) {
		this.redemptionLegDetails = Objects.requireNonNull(redemptionLegDetails);
		return this;
	}

	public List<SwitchSubscriptionLegExecution2> getSubscriptionLegDetails() {
		return subscriptionLegDetails == null ? subscriptionLegDetails = new ArrayList<>() : subscriptionLegDetails;
	}

	public SwitchExecution3 setSubscriptionLegDetails(List<SwitchSubscriptionLegExecution2> subscriptionLegDetails) {
		this.subscriptionLegDetails = Objects.requireNonNull(subscriptionLegDetails);
		return this;
	}

	public Optional<PaymentTransaction14> getCashSettlementDetails() {
		return cashSettlementDetails == null ? Optional.empty() : Optional.of(cashSettlementDetails);
	}

	public SwitchExecution3 setCashSettlementDetails(PaymentTransaction14 cashSettlementDetails) {
		this.cashSettlementDetails = cashSettlementDetails;
		return this;
	}

	public List<ForeignExchangeTerms4> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public SwitchExecution3 setForeignExchangeDetails(List<ForeignExchangeTerms4> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}
}