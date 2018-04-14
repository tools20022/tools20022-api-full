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
import com.tools20022.repository.area.auth.CCPMemberObligationsReportV01;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection86;
import com.tools20022.repository.msg.GenericIdentification165;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Deposit account used by the central counterparty to make payments to and from
 * its clearing members.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAccount1#mmIdentification
 * SettlementAccount1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAccount1#mmEndOfDayInitialMarginCalled
 * SettlementAccount1.mmEndOfDayInitialMarginCalled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAccount1#mmEndOfDayVariationMarginCalled
 * SettlementAccount1.mmEndOfDayVariationMarginCalled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAccount1#mmEndOfDayDefaultFundCalled
 * SettlementAccount1.mmEndOfDayDefaultFundCalled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAccount1#mmEndOfDaySettlementCalled
 * SettlementAccount1.mmEndOfDaySettlementCalled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAccount1#mmEndOfDayOtherCalled
 * SettlementAccount1.mmEndOfDayOtherCalled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAccount1#mmEndOfDayLiquidityCalled
 * SettlementAccount1.mmEndOfDayLiquidityCalled}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementAccount1#mmCurrency
 * SettlementAccount1.mmCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPMemberObligationsReportV01#mmSettlementAccount
 * CCPMemberObligationsReportV01.mmSettlementAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Deposit account used by the central counterparty to make payments to and from its clearing members."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementAccount1", propOrder = {"identification", "endOfDayInitialMarginCalled", "endOfDayVariationMarginCalled", "endOfDayDefaultFundCalled", "endOfDaySettlementCalled", "endOfDayOtherCalled", "endOfDayLiquidityCalled",
		"currency"})
public class SettlementAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected GenericIdentification165 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification165
	 * GenericIdentification165}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAccount1
	 * SettlementAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the settlement account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementAccount1, GenericIdentification165> mmIdentification = new MMMessageAssociationEnd<SettlementAccount1, GenericIdentification165>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAccount1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the settlement account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification165.mmObject();
		}

		@Override
		public GenericIdentification165 getValue(SettlementAccount1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(SettlementAccount1 obj, GenericIdentification165 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "EndOfDayInitlMrgnClld", required = true)
	protected AmountAndDirection86 endOfDayInitialMarginCalled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection86
	 * AmountAndDirection86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAccount1
	 * SettlementAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndOfDayInitlMrgnClld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDayInitialMarginCalled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of initial margin to be called or returned to clearing member the morning following end of day. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86> mmEndOfDayInitialMarginCalled = new MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAccount1.mmObject();
			isDerived = false;
			xmlTag = "EndOfDayInitlMrgnClld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDayInitialMarginCalled";
			definition = "Total value of initial margin to be called or returned to clearing member the morning following end of day. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection86.mmObject();
		}

		@Override
		public AmountAndDirection86 getValue(SettlementAccount1 obj) {
			return obj.getEndOfDayInitialMarginCalled();
		}

		@Override
		public void setValue(SettlementAccount1 obj, AmountAndDirection86 value) {
			obj.setEndOfDayInitialMarginCalled(value);
		}
	};
	@XmlElement(name = "EndOfDayVartnMrgnClld", required = true)
	protected AmountAndDirection86 endOfDayVariationMarginCalled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection86
	 * AmountAndDirection86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAccount1
	 * SettlementAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndOfDayVartnMrgnClld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDayVariationMarginCalled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total cash receivable (or payable) in the relevant currency based on changes in the mark-to-market of a clearing member’s positions, including liabilities (or credits) relating to option premiums, upfront fees or cash calls to cover other mark-to-market exposures where such exposures create a cash payable / receivable from the member. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false).\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86> mmEndOfDayVariationMarginCalled = new MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAccount1.mmObject();
			isDerived = false;
			xmlTag = "EndOfDayVartnMrgnClld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDayVariationMarginCalled";
			definition = "Total cash receivable (or payable) in the relevant currency based on changes in the mark-to-market of a clearing member’s positions, including liabilities (or credits) relating to option premiums, upfront fees or cash calls to cover other mark-to-market exposures where such exposures create a cash payable / receivable from the member. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false).\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection86.mmObject();
		}

		@Override
		public AmountAndDirection86 getValue(SettlementAccount1 obj) {
			return obj.getEndOfDayVariationMarginCalled();
		}

		@Override
		public void setValue(SettlementAccount1 obj, AmountAndDirection86 value) {
			obj.setEndOfDayVariationMarginCalled(value);
		}
	};
	@XmlElement(name = "EndOfDayDfltFndClld", required = true)
	protected AmountAndDirection86 endOfDayDefaultFundCalled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection86
	 * AmountAndDirection86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAccount1
	 * SettlementAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndOfDayDfltFndClld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDayDefaultFundCalled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total net cash receivable (payable) in the relevant currency that will be called to cover default fund requirements. DF receipts from clearing members are positive, payments to members are negative. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86> mmEndOfDayDefaultFundCalled = new MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAccount1.mmObject();
			isDerived = false;
			xmlTag = "EndOfDayDfltFndClld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDayDefaultFundCalled";
			definition = "Total net cash receivable (payable) in the relevant currency that will be called to cover default fund requirements. DF receipts from clearing members are positive, payments to members are negative. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection86.mmObject();
		}

		@Override
		public AmountAndDirection86 getValue(SettlementAccount1 obj) {
			return obj.getEndOfDayDefaultFundCalled();
		}

		@Override
		public void setValue(SettlementAccount1 obj, AmountAndDirection86 value) {
			obj.setEndOfDayDefaultFundCalled(value);
		}
	};
	@XmlElement(name = "EndOfDaySttlmClld", required = true)
	protected AmountAndDirection86 endOfDaySettlementCalled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection86
	 * AmountAndDirection86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAccount1
	 * SettlementAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndOfDaySttlmClld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDaySettlementCalled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total cash receivable (or payable) in the relevant currency arising from settlement or delivery obligations of a Clearing Member positions where such obligations arise in the payment system of the CCP. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86> mmEndOfDaySettlementCalled = new MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAccount1.mmObject();
			isDerived = false;
			xmlTag = "EndOfDaySttlmClld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDaySettlementCalled";
			definition = "Total cash receivable (or payable) in the relevant currency arising from settlement or delivery obligations of a Clearing Member positions where such obligations arise in the payment system of the CCP. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection86.mmObject();
		}

		@Override
		public AmountAndDirection86 getValue(SettlementAccount1 obj) {
			return obj.getEndOfDaySettlementCalled();
		}

		@Override
		public void setValue(SettlementAccount1 obj, AmountAndDirection86 value) {
			obj.setEndOfDaySettlementCalled(value);
		}
	};
	@XmlElement(name = "EndOfDayOthrClld", required = true)
	protected AmountAndDirection86 endOfDayOtherCalled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection86
	 * AmountAndDirection86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAccount1
	 * SettlementAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndOfDayOthrClld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDayOtherCalled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other cash receivable (payables) in the relevant currency that will be called from or paid to the Clearing Member by the CCP. Such obligations may include exchange/clearing fees, and interest on margin interest on mark-to-market, coupon payments (including such payments called and settled by a securities settlement system). Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86> mmEndOfDayOtherCalled = new MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAccount1.mmObject();
			isDerived = false;
			xmlTag = "EndOfDayOthrClld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDayOtherCalled";
			definition = "Other cash receivable (payables) in the relevant currency that will be called from or paid to the Clearing Member by the CCP. Such obligations may include exchange/clearing fees, and interest on margin interest on mark-to-market, coupon payments (including such payments called and settled by a securities settlement system). Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection86.mmObject();
		}

		@Override
		public AmountAndDirection86 getValue(SettlementAccount1 obj) {
			return obj.getEndOfDayOtherCalled();
		}

		@Override
		public void setValue(SettlementAccount1 obj, AmountAndDirection86 value) {
			obj.setEndOfDayOtherCalled(value);
		}
	};
	@XmlElement(name = "EndOfDayLqdtyClld", required = true)
	protected AmountAndDirection86 endOfDayLiquidityCalled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection86
	 * AmountAndDirection86}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAccount1
	 * SettlementAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndOfDayLqdtyClld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDayLiquidityCalled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash receivables (payable) that will be called/paid by the CCP to the clearing member in the relevant currency. If the amount represents a credit for the clearing member, the net cash amount due to be delivered on the reporting date and/or returnable on demand by the Clearing Member. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86> mmEndOfDayLiquidityCalled = new MMMessageAssociationEnd<SettlementAccount1, AmountAndDirection86>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAccount1.mmObject();
			isDerived = false;
			xmlTag = "EndOfDayLqdtyClld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDayLiquidityCalled";
			definition = "Net cash receivables (payable) that will be called/paid by the CCP to the clearing member in the relevant currency. If the amount represents a credit for the clearing member, the net cash amount due to be delivered on the reporting date and/or returnable on demand by the Clearing Member. Indicates whether the clearing member has an obligation to deliver cash to the CCP (true) or receive cash from the CCP (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection86.mmObject();
		}

		@Override
		public AmountAndDirection86 getValue(SettlementAccount1 obj) {
			return obj.getEndOfDayLiquidityCalled();
		}

		@Override
		public void setValue(SettlementAccount1 obj, AmountAndDirection86 value) {
			obj.setEndOfDayLiquidityCalled(value);
		}
	};
	@XmlElement(name = "Ccy", required = true)
	protected ActiveCurrencyCode currency;
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAccount1
	 * SettlementAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the settlement account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementAccount1, ActiveCurrencyCode> mmCurrency = new MMMessageAttribute<SettlementAccount1, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAccount1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the settlement account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(SettlementAccount1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(SettlementAccount1 obj, ActiveCurrencyCode value) {
			obj.setCurrency(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementAccount1.mmIdentification, com.tools20022.repository.msg.SettlementAccount1.mmEndOfDayInitialMarginCalled,
						com.tools20022.repository.msg.SettlementAccount1.mmEndOfDayVariationMarginCalled, com.tools20022.repository.msg.SettlementAccount1.mmEndOfDayDefaultFundCalled,
						com.tools20022.repository.msg.SettlementAccount1.mmEndOfDaySettlementCalled, com.tools20022.repository.msg.SettlementAccount1.mmEndOfDayOtherCalled,
						com.tools20022.repository.msg.SettlementAccount1.mmEndOfDayLiquidityCalled, com.tools20022.repository.msg.SettlementAccount1.mmCurrency);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPMemberObligationsReportV01.mmSettlementAccount);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementAccount1";
				definition = "Deposit account used by the central counterparty to make payments to and from its clearing members.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification165 getIdentification() {
		return identification;
	}

	public SettlementAccount1 setIdentification(GenericIdentification165 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public AmountAndDirection86 getEndOfDayInitialMarginCalled() {
		return endOfDayInitialMarginCalled;
	}

	public SettlementAccount1 setEndOfDayInitialMarginCalled(AmountAndDirection86 endOfDayInitialMarginCalled) {
		this.endOfDayInitialMarginCalled = Objects.requireNonNull(endOfDayInitialMarginCalled);
		return this;
	}

	public AmountAndDirection86 getEndOfDayVariationMarginCalled() {
		return endOfDayVariationMarginCalled;
	}

	public SettlementAccount1 setEndOfDayVariationMarginCalled(AmountAndDirection86 endOfDayVariationMarginCalled) {
		this.endOfDayVariationMarginCalled = Objects.requireNonNull(endOfDayVariationMarginCalled);
		return this;
	}

	public AmountAndDirection86 getEndOfDayDefaultFundCalled() {
		return endOfDayDefaultFundCalled;
	}

	public SettlementAccount1 setEndOfDayDefaultFundCalled(AmountAndDirection86 endOfDayDefaultFundCalled) {
		this.endOfDayDefaultFundCalled = Objects.requireNonNull(endOfDayDefaultFundCalled);
		return this;
	}

	public AmountAndDirection86 getEndOfDaySettlementCalled() {
		return endOfDaySettlementCalled;
	}

	public SettlementAccount1 setEndOfDaySettlementCalled(AmountAndDirection86 endOfDaySettlementCalled) {
		this.endOfDaySettlementCalled = Objects.requireNonNull(endOfDaySettlementCalled);
		return this;
	}

	public AmountAndDirection86 getEndOfDayOtherCalled() {
		return endOfDayOtherCalled;
	}

	public SettlementAccount1 setEndOfDayOtherCalled(AmountAndDirection86 endOfDayOtherCalled) {
		this.endOfDayOtherCalled = Objects.requireNonNull(endOfDayOtherCalled);
		return this;
	}

	public AmountAndDirection86 getEndOfDayLiquidityCalled() {
		return endOfDayLiquidityCalled;
	}

	public SettlementAccount1 setEndOfDayLiquidityCalled(AmountAndDirection86 endOfDayLiquidityCalled) {
		this.endOfDayLiquidityCalled = Objects.requireNonNull(endOfDayLiquidityCalled);
		return this;
	}

	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public SettlementAccount1 setCurrency(ActiveCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}
}