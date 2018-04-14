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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Resources of a legal entity or other financial construct that are available
 * to meet cash obligations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidResources1#mmCentralBankMoneyAmount
 * LiquidResources1.mmCentralBankMoneyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidResources1#mmUnsecuredAmount
 * LiquidResources1.mmUnsecuredAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LiquidResources1#mmDueAmount
 * LiquidResources1.mmDueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidResources1#mmRepurchaseAgreementAmount
 * LiquidResources1.mmRepurchaseAgreementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidResources1#mmCCPInvestmentInstrumentAmount
 * LiquidResources1.mmCCPInvestmentInstrumentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidResources1#mmOtherFinancialInvestmentsAmount
 * LiquidResources1.mmOtherFinancialInvestmentsAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidResources1#mmDefaultersNonCashCollateralAmount
 * LiquidResources1.mmDefaultersNonCashCollateralAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidResources1#mmOtherLiquidityFacilityAmount
 * LiquidResources1.mmOtherLiquidityFacilityAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidResources1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Resources of a legal entity or other financial construct that are available to meet cash obligations."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidResources1", propOrder = {"centralBankMoneyAmount", "unsecuredAmount", "dueAmount", "repurchaseAgreementAmount", "cCPInvestmentInstrumentAmount", "otherFinancialInvestmentsAmount",
		"defaultersNonCashCollateralAmount", "otherLiquidityFacilityAmount"})
public class LiquidResources1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CntrlBkMnyAmt", required = true)
	protected AmountAndDirection6 centralBankMoneyAmount;
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
	 * {@linkplain com.tools20022.repository.msg.LiquidResources1
	 * LiquidResources1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrlBkMnyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankMoneyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of cash held at central banks. That is, the balance held overnight on day T‐1, and flows for the remainder of the horizon. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidResources1, AmountAndDirection6> mmCentralBankMoneyAmount = new MMMessageAssociationEnd<LiquidResources1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidResources1.mmObject();
			isDerived = false;
			xmlTag = "CntrlBkMnyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankMoneyAmount";
			definition = "Value of cash held at central banks. That is, the balance held overnight on day T‐1, and flows for the remainder of the horizon. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(LiquidResources1 obj) {
			return obj.getCentralBankMoneyAmount();
		}

		@Override
		public void setValue(LiquidResources1 obj, AmountAndDirection6 value) {
			obj.setCentralBankMoneyAmount(value);
		}
	};
	@XmlElement(name = "UscrdAmt", required = true)
	protected UnsecuredAmount1 unsecuredAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnsecuredAmount1
	 * UnsecuredAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidResources1
	 * LiquidResources1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UscrdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsecuredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Liquid resources held unsecured at a commercial bank."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidResources1, UnsecuredAmount1> mmUnsecuredAmount = new MMMessageAssociationEnd<LiquidResources1, UnsecuredAmount1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidResources1.mmObject();
			isDerived = false;
			xmlTag = "UscrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsecuredAmount";
			definition = "Liquid resources held unsecured at a commercial bank.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnsecuredAmount1.mmObject();
		}

		@Override
		public UnsecuredAmount1 getValue(LiquidResources1 obj) {
			return obj.getUnsecuredAmount();
		}

		@Override
		public void setValue(LiquidResources1 obj, UnsecuredAmount1 value) {
			obj.setUnsecuredAmount(value);
		}
	};
	@XmlElement(name = "DueAmt", required = true)
	protected AmountAndDirection6 dueAmount;
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
	 * {@linkplain com.tools20022.repository.msg.LiquidResources1
	 * LiquidResources1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of incoming cash flows (for example from maturing investments or reverse repos, or overnight margin calls against non-defaulting members). Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidResources1, AmountAndDirection6> mmDueAmount = new MMMessageAssociationEnd<LiquidResources1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidResources1.mmObject();
			isDerived = false;
			xmlTag = "DueAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueAmount";
			definition = "Value of incoming cash flows (for example from maturing investments or reverse repos, or overnight margin calls against non-defaulting members). Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(LiquidResources1 obj) {
			return obj.getDueAmount();
		}

		@Override
		public void setValue(LiquidResources1 obj, AmountAndDirection6 value) {
			obj.setDueAmount(value);
		}
	};
	@XmlElement(name = "RpAgrmtAmt", required = true)
	protected RepurchaseAgreementAmount1 repurchaseAgreementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreementAmount1
	 * RepurchaseAgreementAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidResources1
	 * LiquidResources1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpAgrmtAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase at an agreed later date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidResources1, RepurchaseAgreementAmount1> mmRepurchaseAgreementAmount = new MMMessageAssociationEnd<LiquidResources1, RepurchaseAgreementAmount1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidResources1.mmObject();
			isDerived = false;
			xmlTag = "RpAgrmtAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreementAmount";
			definition = "Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase at an agreed later date.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepurchaseAgreementAmount1.mmObject();
		}

		@Override
		public RepurchaseAgreementAmount1 getValue(LiquidResources1 obj) {
			return obj.getRepurchaseAgreementAmount();
		}

		@Override
		public void setValue(LiquidResources1 obj, RepurchaseAgreementAmount1 value) {
			obj.setRepurchaseAgreementAmount(value);
		}
	};
	@XmlElement(name = "CCPInvstmtInstrmAmt", required = true)
	protected InvestmentInstrumentAmount1 cCPInvestmentInstrumentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentInstrumentAmount1
	 * InvestmentInstrumentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidResources1
	 * LiquidResources1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CCPInvstmtInstrmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPInvestmentInstrumentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current market value (post-haircut) of flows of marketable financial instruments that are held by the CCP as investment instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidResources1, InvestmentInstrumentAmount1> mmCCPInvestmentInstrumentAmount = new MMMessageAssociationEnd<LiquidResources1, InvestmentInstrumentAmount1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidResources1.mmObject();
			isDerived = false;
			xmlTag = "CCPInvstmtInstrmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPInvestmentInstrumentAmount";
			definition = "Current market value (post-haircut) of flows of marketable financial instruments that are held by the CCP as investment instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentInstrumentAmount1.mmObject();
		}

		@Override
		public InvestmentInstrumentAmount1 getValue(LiquidResources1 obj) {
			return obj.getCCPInvestmentInstrumentAmount();
		}

		@Override
		public void setValue(LiquidResources1 obj, InvestmentInstrumentAmount1 value) {
			obj.setCCPInvestmentInstrumentAmount(value);
		}
	};
	@XmlElement(name = "OthrFinInvstmtsAmt", required = true)
	protected InvestmentInstrumentAmount1 otherFinancialInvestmentsAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentInstrumentAmount1
	 * InvestmentInstrumentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidResources1
	 * LiquidResources1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrFinInvstmtsAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherFinancialInvestmentsAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current market value (post-haircut) of flows of marketable financial instruments that are readily available to the CCP. Indicates if the balance or flows were positive (true) or negative (false)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidResources1, InvestmentInstrumentAmount1> mmOtherFinancialInvestmentsAmount = new MMMessageAssociationEnd<LiquidResources1, InvestmentInstrumentAmount1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidResources1.mmObject();
			isDerived = false;
			xmlTag = "OthrFinInvstmtsAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherFinancialInvestmentsAmount";
			definition = "Current market value (post-haircut) of flows of marketable financial instruments that are readily available to the CCP. Indicates if the balance or flows were positive (true) or negative (false).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentInstrumentAmount1.mmObject();
		}

		@Override
		public InvestmentInstrumentAmount1 getValue(LiquidResources1 obj) {
			return obj.getOtherFinancialInvestmentsAmount();
		}

		@Override
		public void setValue(LiquidResources1 obj, InvestmentInstrumentAmount1 value) {
			obj.setOtherFinancialInvestmentsAmount(value);
		}
	};
	@XmlElement(name = "DfltrsNonCshCollAmt", required = true)
	protected InvestmentInstrumentAmount1 defaultersNonCashCollateralAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentInstrumentAmount1
	 * InvestmentInstrumentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidResources1
	 * LiquidResources1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltrsNonCshCollAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultersNonCashCollateralAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current market value (post-haircut) of flows of marketable financial instruments that are readily available to the CCP placed with the CCP by the defaulting clearing member."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidResources1, InvestmentInstrumentAmount1> mmDefaultersNonCashCollateralAmount = new MMMessageAssociationEnd<LiquidResources1, InvestmentInstrumentAmount1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidResources1.mmObject();
			isDerived = false;
			xmlTag = "DfltrsNonCshCollAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultersNonCashCollateralAmount";
			definition = "Current market value (post-haircut) of flows of marketable financial instruments that are readily available to the CCP placed with the CCP by the defaulting clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentInstrumentAmount1.mmObject();
		}

		@Override
		public InvestmentInstrumentAmount1 getValue(LiquidResources1 obj) {
			return obj.getDefaultersNonCashCollateralAmount();
		}

		@Override
		public void setValue(LiquidResources1 obj, InvestmentInstrumentAmount1 value) {
			obj.setDefaultersNonCashCollateralAmount(value);
		}
	};
	@XmlElement(name = "OthrLqdtyFcltyAmt", required = true)
	protected OtherLiquidityFacilityAmount1 otherLiquidityFacilityAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OtherLiquidityFacilityAmount1
	 * OtherLiquidityFacilityAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidResources1
	 * LiquidResources1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrLqdtyFcltyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherLiquidityFacilityAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of any flows of credit lines, repo lines or equivalents with counterparties other than the two defaulting members."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidResources1, OtherLiquidityFacilityAmount1> mmOtherLiquidityFacilityAmount = new MMMessageAssociationEnd<LiquidResources1, OtherLiquidityFacilityAmount1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidResources1.mmObject();
			isDerived = false;
			xmlTag = "OthrLqdtyFcltyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherLiquidityFacilityAmount";
			definition = "Total value of any flows of credit lines, repo lines or equivalents with counterparties other than the two defaulting members.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OtherLiquidityFacilityAmount1.mmObject();
		}

		@Override
		public OtherLiquidityFacilityAmount1 getValue(LiquidResources1 obj) {
			return obj.getOtherLiquidityFacilityAmount();
		}

		@Override
		public void setValue(LiquidResources1 obj, OtherLiquidityFacilityAmount1 value) {
			obj.setOtherLiquidityFacilityAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidResources1.mmCentralBankMoneyAmount, com.tools20022.repository.msg.LiquidResources1.mmUnsecuredAmount,
						com.tools20022.repository.msg.LiquidResources1.mmDueAmount, com.tools20022.repository.msg.LiquidResources1.mmRepurchaseAgreementAmount, com.tools20022.repository.msg.LiquidResources1.mmCCPInvestmentInstrumentAmount,
						com.tools20022.repository.msg.LiquidResources1.mmOtherFinancialInvestmentsAmount, com.tools20022.repository.msg.LiquidResources1.mmDefaultersNonCashCollateralAmount,
						com.tools20022.repository.msg.LiquidResources1.mmOtherLiquidityFacilityAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidResources1";
				definition = "Resources of a legal entity or other financial construct that are available to meet cash obligations.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection6 getCentralBankMoneyAmount() {
		return centralBankMoneyAmount;
	}

	public LiquidResources1 setCentralBankMoneyAmount(AmountAndDirection6 centralBankMoneyAmount) {
		this.centralBankMoneyAmount = Objects.requireNonNull(centralBankMoneyAmount);
		return this;
	}

	public UnsecuredAmount1 getUnsecuredAmount() {
		return unsecuredAmount;
	}

	public LiquidResources1 setUnsecuredAmount(UnsecuredAmount1 unsecuredAmount) {
		this.unsecuredAmount = Objects.requireNonNull(unsecuredAmount);
		return this;
	}

	public AmountAndDirection6 getDueAmount() {
		return dueAmount;
	}

	public LiquidResources1 setDueAmount(AmountAndDirection6 dueAmount) {
		this.dueAmount = Objects.requireNonNull(dueAmount);
		return this;
	}

	public RepurchaseAgreementAmount1 getRepurchaseAgreementAmount() {
		return repurchaseAgreementAmount;
	}

	public LiquidResources1 setRepurchaseAgreementAmount(RepurchaseAgreementAmount1 repurchaseAgreementAmount) {
		this.repurchaseAgreementAmount = Objects.requireNonNull(repurchaseAgreementAmount);
		return this;
	}

	public InvestmentInstrumentAmount1 getCCPInvestmentInstrumentAmount() {
		return cCPInvestmentInstrumentAmount;
	}

	public LiquidResources1 setCCPInvestmentInstrumentAmount(InvestmentInstrumentAmount1 cCPInvestmentInstrumentAmount) {
		this.cCPInvestmentInstrumentAmount = Objects.requireNonNull(cCPInvestmentInstrumentAmount);
		return this;
	}

	public InvestmentInstrumentAmount1 getOtherFinancialInvestmentsAmount() {
		return otherFinancialInvestmentsAmount;
	}

	public LiquidResources1 setOtherFinancialInvestmentsAmount(InvestmentInstrumentAmount1 otherFinancialInvestmentsAmount) {
		this.otherFinancialInvestmentsAmount = Objects.requireNonNull(otherFinancialInvestmentsAmount);
		return this;
	}

	public InvestmentInstrumentAmount1 getDefaultersNonCashCollateralAmount() {
		return defaultersNonCashCollateralAmount;
	}

	public LiquidResources1 setDefaultersNonCashCollateralAmount(InvestmentInstrumentAmount1 defaultersNonCashCollateralAmount) {
		this.defaultersNonCashCollateralAmount = Objects.requireNonNull(defaultersNonCashCollateralAmount);
		return this;
	}

	public OtherLiquidityFacilityAmount1 getOtherLiquidityFacilityAmount() {
		return otherLiquidityFacilityAmount;
	}

	public LiquidResources1 setOtherLiquidityFacilityAmount(OtherLiquidityFacilityAmount1 otherLiquidityFacilityAmount) {
		this.otherLiquidityFacilityAmount = Objects.requireNonNull(otherLiquidityFacilityAmount);
		return this;
	}
}