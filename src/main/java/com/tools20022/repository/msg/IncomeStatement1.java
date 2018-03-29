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
import com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Statement of the financial performance of a legal entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncomeStatement1#mmClearingFees
 * IncomeStatement1.mmClearingFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncomeStatement1#mmOtherOperatingRevenue
 * IncomeStatement1.mmOtherOperatingRevenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncomeStatement1#mmOperatingExpenses
 * IncomeStatement1.mmOperatingExpenses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncomeStatement1#mmOperatingProfitOrLoss
 * IncomeStatement1.mmOperatingProfitOrLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncomeStatement1#mmNetInterestIncome
 * IncomeStatement1.mmNetInterestIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncomeStatement1#mmOtherNonOperatingRevenue
 * IncomeStatement1.mmOtherNonOperatingRevenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncomeStatement1#mmNonOperatingExpenses
 * IncomeStatement1.mmNonOperatingExpenses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncomeStatement1#mmPreTaxProfitOrLoss
 * IncomeStatement1.mmPreTaxProfitOrLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IncomeStatement1#mmPostTaxProfitOrLoss
 * IncomeStatement1.mmPostTaxProfitOrLoss}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CCPIncomeStatementAndCapitalAdequacyReportV01#mmIncomeStatement
 * CCPIncomeStatementAndCapitalAdequacyReportV01.mmIncomeStatement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IncomeStatement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Statement of the financial performance of a legal entity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IncomeStatement1", propOrder = {"clearingFees", "otherOperatingRevenue", "operatingExpenses", "operatingProfitOrLoss", "netInterestIncome", "otherNonOperatingRevenue", "nonOperatingExpenses", "preTaxProfitOrLoss",
		"postTaxProfitOrLoss"})
public class IncomeStatement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrFees", required = true)
	protected ActiveCurrencyAndAmount clearingFees;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the clearing fees recorded in month-end management reporting for the financial year-to-date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount> mmClearingFees = new MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IncomeStatement1.mmObject();
			isDerived = false;
			xmlTag = "ClrFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingFees";
			definition = "Specifies the clearing fees recorded in month-end management reporting for the financial year-to-date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(IncomeStatement1 obj) {
			return obj.getClearingFees();
		}

		@Override
		public void setValue(IncomeStatement1 obj, ActiveCurrencyAndAmount value) {
			obj.setClearingFees(value);
		}
	};
	@XmlElement(name = "OthrOprgRvn", required = true)
	protected ActiveCurrencyAndAmount otherOperatingRevenue;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrOprgRvn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherOperatingRevenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other operating revenue recorded in month-end management reporting for the financial year-to-date.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount> mmOtherOperatingRevenue = new MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IncomeStatement1.mmObject();
			isDerived = false;
			xmlTag = "OthrOprgRvn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherOperatingRevenue";
			definition = "Other operating revenue recorded in month-end management reporting for the financial year-to-date.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(IncomeStatement1 obj) {
			return obj.getOtherOperatingRevenue();
		}

		@Override
		public void setValue(IncomeStatement1 obj, ActiveCurrencyAndAmount value) {
			obj.setOtherOperatingRevenue(value);
		}
	};
	@XmlElement(name = "OprgExpnss", required = true)
	protected ActiveCurrencyAndAmount operatingExpenses;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprgExpnss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperatingExpenses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Operating expenses recorded in month-end management reporting for the financial year-to-date.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount> mmOperatingExpenses = new MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IncomeStatement1.mmObject();
			isDerived = false;
			xmlTag = "OprgExpnss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperatingExpenses";
			definition = "Operating expenses recorded in month-end management reporting for the financial year-to-date.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(IncomeStatement1 obj) {
			return obj.getOperatingExpenses();
		}

		@Override
		public void setValue(IncomeStatement1 obj, ActiveCurrencyAndAmount value) {
			obj.setOperatingExpenses(value);
		}
	};
	@XmlElement(name = "OprgPrftOrLoss", required = true)
	protected AmountAndDirection6 operatingProfitOrLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprgPrftOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperatingProfitOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the operating profit (true) or loss (false) recorded in the month-end management reporting for the financial year-to-date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IncomeStatement1, AmountAndDirection6> mmOperatingProfitOrLoss = new MMMessageAssociationEnd<IncomeStatement1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IncomeStatement1.mmObject();
			isDerived = false;
			xmlTag = "OprgPrftOrLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperatingProfitOrLoss";
			definition = "Indicates the operating profit (true) or loss (false) recorded in the month-end management reporting for the financial year-to-date.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(IncomeStatement1 obj) {
			return obj.getOperatingProfitOrLoss();
		}

		@Override
		public void setValue(IncomeStatement1 obj, AmountAndDirection6 value) {
			obj.setOperatingProfitOrLoss(value);
		}
	};
	@XmlElement(name = "NetIntrstIncm", required = true)
	protected ActiveCurrencyAndAmount netInterestIncome;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetIntrstIncm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetInterestIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net interest income recorded in month-end management reporting for the financial year-to-date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount> mmNetInterestIncome = new MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IncomeStatement1.mmObject();
			isDerived = false;
			xmlTag = "NetIntrstIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetInterestIncome";
			definition = "Net interest income recorded in month-end management reporting for the financial year-to-date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(IncomeStatement1 obj) {
			return obj.getNetInterestIncome();
		}

		@Override
		public void setValue(IncomeStatement1 obj, ActiveCurrencyAndAmount value) {
			obj.setNetInterestIncome(value);
		}
	};
	@XmlElement(name = "OthrNonOprgRvn", required = true)
	protected ActiveCurrencyAndAmount otherNonOperatingRevenue;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrNonOprgRvn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonOperatingRevenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other non-operating revenue recorded in month-end management reporting for the financial year-to-date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount> mmOtherNonOperatingRevenue = new MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IncomeStatement1.mmObject();
			isDerived = false;
			xmlTag = "OthrNonOprgRvn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonOperatingRevenue";
			definition = "Other non-operating revenue recorded in month-end management reporting for the financial year-to-date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(IncomeStatement1 obj) {
			return obj.getOtherNonOperatingRevenue();
		}

		@Override
		public void setValue(IncomeStatement1 obj, ActiveCurrencyAndAmount value) {
			obj.setOtherNonOperatingRevenue(value);
		}
	};
	@XmlElement(name = "NonOprgExpnss", required = true)
	protected ActiveCurrencyAndAmount nonOperatingExpenses;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonOprgExpnss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonOperatingExpenses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non-operating expenses recorded in month-end management reporting for the financial year-to-date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount> mmNonOperatingExpenses = new MMMessageAttribute<IncomeStatement1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IncomeStatement1.mmObject();
			isDerived = false;
			xmlTag = "NonOprgExpnss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOperatingExpenses";
			definition = "Non-operating expenses recorded in month-end management reporting for the financial year-to-date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(IncomeStatement1 obj) {
			return obj.getNonOperatingExpenses();
		}

		@Override
		public void setValue(IncomeStatement1 obj, ActiveCurrencyAndAmount value) {
			obj.setNonOperatingExpenses(value);
		}
	};
	@XmlElement(name = "PreTaxPrftOrLoss", required = true)
	protected AmountAndDirection6 preTaxProfitOrLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreTaxPrftOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreTaxProfitOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the pre-tax profit (true) or loss (false) recorded in month-end management reporting for the financial year-to-date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IncomeStatement1, AmountAndDirection6> mmPreTaxProfitOrLoss = new MMMessageAssociationEnd<IncomeStatement1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IncomeStatement1.mmObject();
			isDerived = false;
			xmlTag = "PreTaxPrftOrLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreTaxProfitOrLoss";
			definition = "Indicates the pre-tax profit (true) or loss (false) recorded in month-end management reporting for the financial year-to-date.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(IncomeStatement1 obj) {
			return obj.getPreTaxProfitOrLoss();
		}

		@Override
		public void setValue(IncomeStatement1 obj, AmountAndDirection6 value) {
			obj.setPreTaxProfitOrLoss(value);
		}
	};
	@XmlElement(name = "PstTaxPrftOrLoss", required = true)
	protected AmountAndDirection6 postTaxProfitOrLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IncomeStatement1
	 * IncomeStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstTaxPrftOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostTaxProfitOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the post-tax profit (true) or loss (false) recorded in month-end management reporting for the financial year-to-date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IncomeStatement1, AmountAndDirection6> mmPostTaxProfitOrLoss = new MMMessageAssociationEnd<IncomeStatement1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IncomeStatement1.mmObject();
			isDerived = false;
			xmlTag = "PstTaxPrftOrLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostTaxProfitOrLoss";
			definition = "Indicates the post-tax profit (true) or loss (false) recorded in month-end management reporting for the financial year-to-date.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(IncomeStatement1 obj) {
			return obj.getPostTaxProfitOrLoss();
		}

		@Override
		public void setValue(IncomeStatement1 obj, AmountAndDirection6 value) {
			obj.setPostTaxProfitOrLoss(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IncomeStatement1.mmClearingFees, com.tools20022.repository.msg.IncomeStatement1.mmOtherOperatingRevenue,
						com.tools20022.repository.msg.IncomeStatement1.mmOperatingExpenses, com.tools20022.repository.msg.IncomeStatement1.mmOperatingProfitOrLoss, com.tools20022.repository.msg.IncomeStatement1.mmNetInterestIncome,
						com.tools20022.repository.msg.IncomeStatement1.mmOtherNonOperatingRevenue, com.tools20022.repository.msg.IncomeStatement1.mmNonOperatingExpenses, com.tools20022.repository.msg.IncomeStatement1.mmPreTaxProfitOrLoss,
						com.tools20022.repository.msg.IncomeStatement1.mmPostTaxProfitOrLoss);
				messageBuildingBlock_lazy = () -> Arrays.asList(CCPIncomeStatementAndCapitalAdequacyReportV01.mmIncomeStatement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IncomeStatement1";
				definition = "Statement of the financial performance of a legal entity.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getClearingFees() {
		return clearingFees;
	}

	public IncomeStatement1 setClearingFees(ActiveCurrencyAndAmount clearingFees) {
		this.clearingFees = Objects.requireNonNull(clearingFees);
		return this;
	}

	public ActiveCurrencyAndAmount getOtherOperatingRevenue() {
		return otherOperatingRevenue;
	}

	public IncomeStatement1 setOtherOperatingRevenue(ActiveCurrencyAndAmount otherOperatingRevenue) {
		this.otherOperatingRevenue = Objects.requireNonNull(otherOperatingRevenue);
		return this;
	}

	public ActiveCurrencyAndAmount getOperatingExpenses() {
		return operatingExpenses;
	}

	public IncomeStatement1 setOperatingExpenses(ActiveCurrencyAndAmount operatingExpenses) {
		this.operatingExpenses = Objects.requireNonNull(operatingExpenses);
		return this;
	}

	public AmountAndDirection6 getOperatingProfitOrLoss() {
		return operatingProfitOrLoss;
	}

	public IncomeStatement1 setOperatingProfitOrLoss(AmountAndDirection6 operatingProfitOrLoss) {
		this.operatingProfitOrLoss = Objects.requireNonNull(operatingProfitOrLoss);
		return this;
	}

	public ActiveCurrencyAndAmount getNetInterestIncome() {
		return netInterestIncome;
	}

	public IncomeStatement1 setNetInterestIncome(ActiveCurrencyAndAmount netInterestIncome) {
		this.netInterestIncome = Objects.requireNonNull(netInterestIncome);
		return this;
	}

	public ActiveCurrencyAndAmount getOtherNonOperatingRevenue() {
		return otherNonOperatingRevenue;
	}

	public IncomeStatement1 setOtherNonOperatingRevenue(ActiveCurrencyAndAmount otherNonOperatingRevenue) {
		this.otherNonOperatingRevenue = Objects.requireNonNull(otherNonOperatingRevenue);
		return this;
	}

	public ActiveCurrencyAndAmount getNonOperatingExpenses() {
		return nonOperatingExpenses;
	}

	public IncomeStatement1 setNonOperatingExpenses(ActiveCurrencyAndAmount nonOperatingExpenses) {
		this.nonOperatingExpenses = Objects.requireNonNull(nonOperatingExpenses);
		return this;
	}

	public AmountAndDirection6 getPreTaxProfitOrLoss() {
		return preTaxProfitOrLoss;
	}

	public IncomeStatement1 setPreTaxProfitOrLoss(AmountAndDirection6 preTaxProfitOrLoss) {
		this.preTaxProfitOrLoss = Objects.requireNonNull(preTaxProfitOrLoss);
		return this;
	}

	public AmountAndDirection6 getPostTaxProfitOrLoss() {
		return postTaxProfitOrLoss;
	}

	public IncomeStatement1 setPostTaxProfitOrLoss(AmountAndDirection6 postTaxProfitOrLoss) {
		this.postTaxProfitOrLoss = Objects.requireNonNull(postTaxProfitOrLoss);
		return this;
	}
}