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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RateAndAmountFormat17Choice;
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code;
import com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max3Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Period3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action option cash
 * movement details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD4#mmPlaceAndName
 * CashOptionSD4.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmReinvestmentIncomeClassification
 * CashOptionSD4.mmReinvestmentIncomeClassification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD4#mmDTCPayMethod
 * CashOptionSD4.mmDTCPayMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD4#mmDTCPayOrder
 * CashOptionSD4.mmDTCPayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmEntitlementCalculationMethod
 * CashOptionSD4.mmEntitlementCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmEstimatedRateFlag
 * CashOptionSD4.mmEstimatedRateFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmNRATaxReportableFlag
 * CashOptionSD4.mmNRATaxReportableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmProtectChargeFlag
 * CashOptionSD4.mmProtectChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmDeclaredCashRate
 * CashOptionSD4.mmDeclaredCashRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmDeclaredGrossRate
 * CashOptionSD4.mmDeclaredGrossRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmDeclaredNetRate
 * CashOptionSD4.mmDeclaredNetRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmDeclaredFeeRate
 * CashOptionSD4.mmDeclaredFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD4#mmDTCUSTaxInstructionPeriod
 * CashOptionSD4.mmDTCUSTaxInstructionPeriod}</li>
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
 * "CashOptionSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option cash movement details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOptionSD4", propOrder = {"placeAndName", "reinvestmentIncomeClassification", "dTCPayMethod", "dTCPayOrder", "entitlementCalculationMethod", "estimatedRateFlag", "nRATaxReportableFlag", "protectChargeFlag",
		"declaredCashRate", "declaredGrossRate", "declaredNetRate", "declaredFeeRate", "dTCUSTaxInstructionPeriod"})
public class CashOptionSD4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Max350Text> mmPlaceAndName = new MMMessageAttribute<CashOptionSD4, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CashOptionSD4 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "RinvstmtIncmClssfctn")
	protected ReinvestmentIncomeClassification1Code reinvestmentIncomeClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReinvestmentIncomeClassification1Code
	 * ReinvestmentIncomeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtIncmClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Reinvestment Income Classification</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentIncomeClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income classification of the cash proceeds for dividend reinvestment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<ReinvestmentIncomeClassification1Code>> mmReinvestmentIncomeClassification = new MMMessageAttribute<CashOptionSD4, Optional<ReinvestmentIncomeClassification1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtIncmClssfctn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Reinvestment Income Classification"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentIncomeClassification";
			definition = "Income classification of the cash proceeds for dividend reinvestment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReinvestmentIncomeClassification1Code.mmObject();
		}

		@Override
		public Optional<ReinvestmentIncomeClassification1Code> getValue(CashOptionSD4 obj) {
			return obj.getReinvestmentIncomeClassification();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<ReinvestmentIncomeClassification1Code> value) {
			obj.setReinvestmentIncomeClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCPayMtd")
	protected Max3Text dTCPayMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Pay Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<Max3Text>> mmDTCPayMethod = new MMMessageAttribute<CashOptionSD4, Optional<Max3Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "DTCPayMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayMethod";
			definition = "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(CashOptionSD4 obj) {
			return obj.getDTCPayMethod();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<Max3Text> value) {
			obj.setDTCPayMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCPayOrdr")
	protected Max3Text dTCPayOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCPayOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC Pay Order</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCPayOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<Max3Text>> mmDTCPayOrder = new MMMessageAttribute<CashOptionSD4, Optional<Max3Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "DTCPayOrdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Order"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayOrder";
			definition = "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(CashOptionSD4 obj) {
			return obj.getDTCPayOrder();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<Max3Text> value) {
			obj.setDTCPayOrder(value.orElse(null));
		}
	};
	@XmlElement(name = "EntitlmntClctnMtd")
	protected DTCEntitlementCalculationMethod1Code entitlementCalculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code
	 * DTCEntitlementCalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Entitlement Calculation Method</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementCalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the entitlements were calculated optional dividends."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<DTCEntitlementCalculationMethod1Code>> mmEntitlementCalculationMethod = new MMMessageAttribute<CashOptionSD4, Optional<DTCEntitlementCalculationMethod1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntClctnMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Entitlement Calculation Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementCalculationMethod";
			definition = "Indicates how the entitlements were calculated optional dividends.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}

		@Override
		public Optional<DTCEntitlementCalculationMethod1Code> getValue(CashOptionSD4 obj) {
			return obj.getEntitlementCalculationMethod();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<DTCEntitlementCalculationMethod1Code> value) {
			obj.setEntitlementCalculationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdRateFlg")
	protected YesNoIndicator estimatedRateFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdRateFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Estimated Rate Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedRateFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denotes whether the rate is approximate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<YesNoIndicator>> mmEstimatedRateFlag = new MMMessageAttribute<CashOptionSD4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "EstmtdRateFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Estimated Rate Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedRateFlag";
			definition = "Denotes whether the rate is approximate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOptionSD4 obj) {
			return obj.getEstimatedRateFlag();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<YesNoIndicator> value) {
			obj.setEstimatedRateFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "NRATaxRptblFlg")
	protected YesNoIndicator nRATaxReportableFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NRATaxRptblFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: NRA Tax Reportable Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NRATaxReportableFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the income events which are subject to withholding tax if paid to a non-U.S. resident alien (NRA)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<YesNoIndicator>> mmNRATaxReportableFlag = new MMMessageAttribute<CashOptionSD4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "NRATaxRptblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "NRA Tax Reportable Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATaxReportableFlag";
			definition = "Identifies the income events which are subject to withholding tax if paid to a non-U.S. resident alien (NRA).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOptionSD4 obj) {
			return obj.getNRATaxReportableFlag();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<YesNoIndicator> value) {
			obj.setNRATaxReportableFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctChrgFlg")
	protected YesNoIndicator protectChargeFlag;
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctChrgFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Protect Charge Flag</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectChargeFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<YesNoIndicator>> mmProtectChargeFlag = new MMMessageAttribute<CashOptionSD4, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "PrtctChrgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Charge Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectChargeFlag";
			definition = "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOptionSD4 obj) {
			return obj.getProtectChargeFlag();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<YesNoIndicator> value) {
			obj.setProtectChargeFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdCshRate")
	protected RateAndAmountFormat17Choice declaredCashRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat17Choice
	 * RateAndAmountFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdCshRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Declared Cash Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredCashRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate associated to the payout as declared on the market by the issuer or offeror."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<RateAndAmountFormat17Choice>> mmDeclaredCashRate = new MMMessageAttribute<CashOptionSD4, Optional<RateAndAmountFormat17Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "DclrdCshRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Cash Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredCashRate";
			definition = "Cash rate associated to the payout as declared on the market by the issuer or offeror.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat17Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat17Choice> getValue(CashOptionSD4 obj) {
			return obj.getDeclaredCashRate();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<RateAndAmountFormat17Choice> value) {
			obj.setDeclaredCashRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdGrssRate")
	protected RateAndAmountFormat17Choice declaredGrossRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat17Choice
	 * RateAndAmountFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdGrssRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Declared Gross Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredGrossRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Gross cash rate associated to the payout as declared on the market by the issuer or offeror."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<RateAndAmountFormat17Choice>> mmDeclaredGrossRate = new MMMessageAttribute<CashOptionSD4, Optional<RateAndAmountFormat17Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "DclrdGrssRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Gross Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredGrossRate";
			definition = "Gross cash rate associated to the payout as declared on the market by the issuer or offeror.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat17Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat17Choice> getValue(CashOptionSD4 obj) {
			return obj.getDeclaredGrossRate();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<RateAndAmountFormat17Choice> value) {
			obj.setDeclaredGrossRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdNetRate")
	protected RateAndAmountFormat17Choice declaredNetRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat17Choice
	 * RateAndAmountFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdNetRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Declared Net Rate</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredNetRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash rate associated to the payout as declared on the market by the issuer or offeror."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<RateAndAmountFormat17Choice>> mmDeclaredNetRate = new MMMessageAttribute<CashOptionSD4, Optional<RateAndAmountFormat17Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "DclrdNetRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Net Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredNetRate";
			definition = "Net cash rate associated to the payout as declared on the market by the issuer or offeror.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat17Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat17Choice> getValue(CashOptionSD4 obj) {
			return obj.getDeclaredNetRate();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<RateAndAmountFormat17Choice> value) {
			obj.setDeclaredNetRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdFeeRate")
	protected RateAndAmountFormat17Choice declaredFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat17Choice
	 * RateAndAmountFormat17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrdFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Declared Fee Rate, DTCCSynonym: Currency
	 * (Declared Fee Rate)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclaredFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the fee will be charged to a DTC participant."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<RateAndAmountFormat17Choice>> mmDeclaredFeeRate = new MMMessageAttribute<CashOptionSD4, Optional<RateAndAmountFormat17Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "DclrdFeeRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Fee Rate"), new DTCCSynonym(this, "Currency (Declared Fee Rate)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredFeeRate";
			definition = "Rate at which the fee will be charged to a DTC participant.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat17Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat17Choice> getValue(CashOptionSD4 obj) {
			return obj.getDeclaredFeeRate();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<RateAndAmountFormat17Choice> value) {
			obj.setDeclaredFeeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCUSTaxInstrPrd")
	protected Period3 dTCUSTaxInstructionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period3 Period3}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD4 CashOptionSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCUSTaxInstrPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: DTC NRA Tax Instruction Expiration Date,
	 * DTCCSynonym: DTC NRA Tax Instruction Start Date</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCUSTaxInstructionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the period during which the instructions for DTC (The Depository Trust Corporation) US Tax service will be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD4, Optional<Period3>> mmDTCUSTaxInstructionPeriod = new MMMessageAttribute<CashOptionSD4, Optional<Period3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD4.mmObject();
			isDerived = false;
			xmlTag = "DTCUSTaxInstrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC NRA Tax Instruction Expiration Date"), new DTCCSynonym(this, "DTC NRA Tax Instruction Start Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCUSTaxInstructionPeriod";
			definition = "Indicates the period during which the instructions for DTC (The Depository Trust Corporation) US Tax service will be accepted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period3.mmObject();
		}

		@Override
		public Optional<Period3> getValue(CashOptionSD4 obj) {
			return obj.getDTCUSTaxInstructionPeriod();
		}

		@Override
		public void setValue(CashOptionSD4 obj, Optional<Period3> value) {
			obj.setDTCUSTaxInstructionPeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOptionSD4.mmPlaceAndName, com.tools20022.repository.msg.CashOptionSD4.mmReinvestmentIncomeClassification,
						com.tools20022.repository.msg.CashOptionSD4.mmDTCPayMethod, com.tools20022.repository.msg.CashOptionSD4.mmDTCPayOrder, com.tools20022.repository.msg.CashOptionSD4.mmEntitlementCalculationMethod,
						com.tools20022.repository.msg.CashOptionSD4.mmEstimatedRateFlag, com.tools20022.repository.msg.CashOptionSD4.mmNRATaxReportableFlag, com.tools20022.repository.msg.CashOptionSD4.mmProtectChargeFlag,
						com.tools20022.repository.msg.CashOptionSD4.mmDeclaredCashRate, com.tools20022.repository.msg.CashOptionSD4.mmDeclaredGrossRate, com.tools20022.repository.msg.CashOptionSD4.mmDeclaredNetRate,
						com.tools20022.repository.msg.CashOptionSD4.mmDeclaredFeeRate, com.tools20022.repository.msg.CashOptionSD4.mmDTCUSTaxInstructionPeriod);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CashOptionSD4";
				definition = "Provides additional information regarding corporate action option cash movement details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CashOptionSD4 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<ReinvestmentIncomeClassification1Code> getReinvestmentIncomeClassification() {
		return reinvestmentIncomeClassification == null ? Optional.empty() : Optional.of(reinvestmentIncomeClassification);
	}

	public CashOptionSD4 setReinvestmentIncomeClassification(ReinvestmentIncomeClassification1Code reinvestmentIncomeClassification) {
		this.reinvestmentIncomeClassification = reinvestmentIncomeClassification;
		return this;
	}

	public Optional<Max3Text> getDTCPayMethod() {
		return dTCPayMethod == null ? Optional.empty() : Optional.of(dTCPayMethod);
	}

	public CashOptionSD4 setDTCPayMethod(Max3Text dTCPayMethod) {
		this.dTCPayMethod = dTCPayMethod;
		return this;
	}

	public Optional<Max3Text> getDTCPayOrder() {
		return dTCPayOrder == null ? Optional.empty() : Optional.of(dTCPayOrder);
	}

	public CashOptionSD4 setDTCPayOrder(Max3Text dTCPayOrder) {
		this.dTCPayOrder = dTCPayOrder;
		return this;
	}

	public Optional<DTCEntitlementCalculationMethod1Code> getEntitlementCalculationMethod() {
		return entitlementCalculationMethod == null ? Optional.empty() : Optional.of(entitlementCalculationMethod);
	}

	public CashOptionSD4 setEntitlementCalculationMethod(DTCEntitlementCalculationMethod1Code entitlementCalculationMethod) {
		this.entitlementCalculationMethod = entitlementCalculationMethod;
		return this;
	}

	public Optional<YesNoIndicator> getEstimatedRateFlag() {
		return estimatedRateFlag == null ? Optional.empty() : Optional.of(estimatedRateFlag);
	}

	public CashOptionSD4 setEstimatedRateFlag(YesNoIndicator estimatedRateFlag) {
		this.estimatedRateFlag = estimatedRateFlag;
		return this;
	}

	public Optional<YesNoIndicator> getNRATaxReportableFlag() {
		return nRATaxReportableFlag == null ? Optional.empty() : Optional.of(nRATaxReportableFlag);
	}

	public CashOptionSD4 setNRATaxReportableFlag(YesNoIndicator nRATaxReportableFlag) {
		this.nRATaxReportableFlag = nRATaxReportableFlag;
		return this;
	}

	public Optional<YesNoIndicator> getProtectChargeFlag() {
		return protectChargeFlag == null ? Optional.empty() : Optional.of(protectChargeFlag);
	}

	public CashOptionSD4 setProtectChargeFlag(YesNoIndicator protectChargeFlag) {
		this.protectChargeFlag = protectChargeFlag;
		return this;
	}

	public Optional<RateAndAmountFormat17Choice> getDeclaredCashRate() {
		return declaredCashRate == null ? Optional.empty() : Optional.of(declaredCashRate);
	}

	public CashOptionSD4 setDeclaredCashRate(RateAndAmountFormat17Choice declaredCashRate) {
		this.declaredCashRate = declaredCashRate;
		return this;
	}

	public Optional<RateAndAmountFormat17Choice> getDeclaredGrossRate() {
		return declaredGrossRate == null ? Optional.empty() : Optional.of(declaredGrossRate);
	}

	public CashOptionSD4 setDeclaredGrossRate(RateAndAmountFormat17Choice declaredGrossRate) {
		this.declaredGrossRate = declaredGrossRate;
		return this;
	}

	public Optional<RateAndAmountFormat17Choice> getDeclaredNetRate() {
		return declaredNetRate == null ? Optional.empty() : Optional.of(declaredNetRate);
	}

	public CashOptionSD4 setDeclaredNetRate(RateAndAmountFormat17Choice declaredNetRate) {
		this.declaredNetRate = declaredNetRate;
		return this;
	}

	public Optional<RateAndAmountFormat17Choice> getDeclaredFeeRate() {
		return declaredFeeRate == null ? Optional.empty() : Optional.of(declaredFeeRate);
	}

	public CashOptionSD4 setDeclaredFeeRate(RateAndAmountFormat17Choice declaredFeeRate) {
		this.declaredFeeRate = declaredFeeRate;
		return this;
	}

	public Optional<Period3> getDTCUSTaxInstructionPeriod() {
		return dTCUSTaxInstructionPeriod == null ? Optional.empty() : Optional.of(dTCUSTaxInstructionPeriod);
	}

	public CashOptionSD4 setDTCUSTaxInstructionPeriod(Period3 dTCUSTaxInstructionPeriod) {
		this.dTCUSTaxInstructionPeriod = dTCUSTaxInstructionPeriod;
		return this;
	}
}