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
import com.tools20022.repository.choice.PriceFormatSD2Choice;
import com.tools20022.repository.codeset.DTCCPayoutType3Code;
import com.tools20022.repository.codeset.DTCEntitlementCalculationMethod1Code;
import com.tools20022.repository.datatype.Exact32AlphaNumericText;
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
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD9#mmPlaceAndName
 * CashOptionSD9.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD9#mmPayoutType
 * CashOptionSD9.mmPayoutType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDTCPayMethod
 * CashOptionSD9.mmDTCPayMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDTCPayOrder
 * CashOptionSD9.mmDTCPayOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmEntitlementCalculationMethod
 * CashOptionSD9.mmEntitlementCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmEstimatedRateFlag
 * CashOptionSD9.mmEstimatedRateFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmNRATaxReportableFlag
 * CashOptionSD9.mmNRATaxReportableFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmProtectChargeFlag
 * CashOptionSD9.mmProtectChargeFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDeclaredCashRate
 * CashOptionSD9.mmDeclaredCashRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDeclaredGrossRate
 * CashOptionSD9.mmDeclaredGrossRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDeclaredNetRate
 * CashOptionSD9.mmDeclaredNetRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDeclaredFeeRate
 * CashOptionSD9.mmDeclaredFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmDTCUSTaxInstructionPeriod
 * CashOptionSD9.mmDTCUSTaxInstructionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOptionSD9#mmRDPReferenceNumber
 * CashOptionSD9.mmRDPReferenceNumber}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashOptionSD9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option cash movement details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashOptionSD10 CashOptionSD10}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.CashOptionSD8
 * CashOptionSD8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOptionSD9", propOrder = {"placeAndName", "payoutType", "dTCPayMethod", "dTCPayOrder", "entitlementCalculationMethod", "estimatedRateFlag", "nRATaxReportableFlag", "protectChargeFlag", "declaredCashRate",
		"declaredGrossRate", "declaredNetRate", "declaredFeeRate", "dTCUSTaxInstructionPeriod", "rDPReferenceNumber"})
public class CashOptionSD9 {

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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmPlaceAndName
	 * CashOptionSD10.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmPlaceAndName
	 * CashOptionSD8.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Max350Text> mmPlaceAndName = new MMMessageAttribute<CashOptionSD9, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmPlaceAndName);
			previousVersion_lazy = () -> CashOptionSD8.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CashOptionSD9 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "PyoutTp", required = true)
	protected DTCCPayoutType3Code payoutType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCPayoutType3Code
	 * DTCCPayoutType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyoutTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayoutType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of payout associated with the event (for example: principal, long term capital gain)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmPayoutType
	 * CashOptionSD10.mmPayoutType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmPayoutType
	 * CashOptionSD8.mmPayoutType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, DTCCPayoutType3Code> mmPayoutType = new MMMessageAttribute<CashOptionSD9, DTCCPayoutType3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "PyoutTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayoutType";
			definition = "Specifies the type of payout associated with the event (for example: principal, long term capital gain).";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmPayoutType);
			previousVersion_lazy = () -> CashOptionSD8.mmPayoutType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DTCCPayoutType3Code.mmObject();
		}

		@Override
		public DTCCPayoutType3Code getValue(CashOptionSD9 obj) {
			return obj.getPayoutType();
		}

		@Override
		public void setValue(CashOptionSD9 obj, DTCCPayoutType3Code value) {
			obj.setPayoutType(value);
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDTCPayMethod
	 * CashOptionSD10.mmDTCPayMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDTCPayMethod
	 * CashOptionSD8.mmDTCPayMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<Max3Text>> mmDTCPayMethod = new MMMessageAttribute<CashOptionSD9, Optional<Max3Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "DTCPayMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayMethod";
			definition = "Indicates the type of payment. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmDTCPayMethod);
			previousVersion_lazy = () -> CashOptionSD8.mmDTCPayMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(CashOptionSD9 obj) {
			return obj.getDTCPayMethod();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<Max3Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDTCPayOrder
	 * CashOptionSD10.mmDTCPayOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDTCPayOrder
	 * CashOptionSD8.mmDTCPayOrder}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<Max3Text>> mmDTCPayOrder = new MMMessageAttribute<CashOptionSD9, Optional<Max3Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "DTCPayOrdr";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC Pay Order"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCPayOrder";
			definition = "Indicates the payment order. Used in stock dividends processing at DTC (The Depository Trust Corporation). Valid values list will be maintained separately from the schema.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmDTCPayOrder);
			previousVersion_lazy = () -> CashOptionSD8.mmDTCPayOrder;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(CashOptionSD9 obj) {
			return obj.getDTCPayOrder();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<Max3Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmEntitlementCalculationMethod
	 * CashOptionSD10.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmEntitlementCalculationMethod
	 * CashOptionSD8.mmEntitlementCalculationMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<DTCEntitlementCalculationMethod1Code>> mmEntitlementCalculationMethod = new MMMessageAttribute<CashOptionSD9, Optional<DTCEntitlementCalculationMethod1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "EntitlmntClctnMtd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Entitlement Calculation Method"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementCalculationMethod";
			definition = "Indicates how the entitlements were calculated optional dividends.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmEntitlementCalculationMethod);
			previousVersion_lazy = () -> CashOptionSD8.mmEntitlementCalculationMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCEntitlementCalculationMethod1Code.mmObject();
		}

		@Override
		public Optional<DTCEntitlementCalculationMethod1Code> getValue(CashOptionSD9 obj) {
			return obj.getEntitlementCalculationMethod();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<DTCEntitlementCalculationMethod1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmEstimatedRateFlag
	 * CashOptionSD10.mmEstimatedRateFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmEstimatedRateFlag
	 * CashOptionSD8.mmEstimatedRateFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<YesNoIndicator>> mmEstimatedRateFlag = new MMMessageAttribute<CashOptionSD9, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "EstmtdRateFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Estimated Rate Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedRateFlag";
			definition = "Denotes whether the rate is approximate.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmEstimatedRateFlag);
			previousVersion_lazy = () -> CashOptionSD8.mmEstimatedRateFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOptionSD9 obj) {
			return obj.getEstimatedRateFlag();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmNRATaxReportableFlag
	 * CashOptionSD10.mmNRATaxReportableFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmNRATaxReportableFlag
	 * CashOptionSD8.mmNRATaxReportableFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<YesNoIndicator>> mmNRATaxReportableFlag = new MMMessageAttribute<CashOptionSD9, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "NRATaxRptblFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "NRA Tax Reportable Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NRATaxReportableFlag";
			definition = "Identifies the income events which are subject to withholding tax if paid to a non-U.S. resident alien (NRA).";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmNRATaxReportableFlag);
			previousVersion_lazy = () -> CashOptionSD8.mmNRATaxReportableFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOptionSD9 obj) {
			return obj.getNRATaxReportableFlag();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmProtectChargeFlag
	 * CashOptionSD10.mmProtectChargeFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmProtectChargeFlag
	 * CashOptionSD8.mmProtectChargeFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<YesNoIndicator>> mmProtectChargeFlag = new MMMessageAttribute<CashOptionSD9, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "PrtctChrgFlg";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Protect Charge Flag"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectChargeFlag";
			definition = "Indicates whether a charge is levied on the protect instructions at the time when the protect is submitted or at the time of the cover. Applies to warrants or rights exercise scenario where the holder must put up money with rights or warrants execution. When this flag is set to yes - charges are due at the time of the protect, when it is set to \"no\" changes are due when protect is covered.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmProtectChargeFlag);
			previousVersion_lazy = () -> CashOptionSD8.mmProtectChargeFlag;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOptionSD9 obj) {
			return obj.getProtectChargeFlag();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<YesNoIndicator> value) {
			obj.setProtectChargeFlag(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdCshRate")
	protected PriceFormatSD2Choice declaredCashRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDeclaredCashRate
	 * CashOptionSD10.mmDeclaredCashRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDeclaredCashRate
	 * CashOptionSD8.mmDeclaredCashRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<PriceFormatSD2Choice>> mmDeclaredCashRate = new MMMessageAttribute<CashOptionSD9, Optional<PriceFormatSD2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "DclrdCshRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Cash Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredCashRate";
			definition = "Cash rate associated to the payout as declared on the market by the issuer or offeror.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmDeclaredCashRate);
			previousVersion_lazy = () -> CashOptionSD8.mmDeclaredCashRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
		}

		@Override
		public Optional<PriceFormatSD2Choice> getValue(CashOptionSD9 obj) {
			return obj.getDeclaredCashRate();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<PriceFormatSD2Choice> value) {
			obj.setDeclaredCashRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdGrssRate")
	protected PriceFormatSD2Choice declaredGrossRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDeclaredGrossRate
	 * CashOptionSD10.mmDeclaredGrossRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDeclaredGrossRate
	 * CashOptionSD8.mmDeclaredGrossRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<PriceFormatSD2Choice>> mmDeclaredGrossRate = new MMMessageAttribute<CashOptionSD9, Optional<PriceFormatSD2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "DclrdGrssRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Gross Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredGrossRate";
			definition = "Gross cash rate associated to the payout as declared on the market by the issuer or offeror.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmDeclaredGrossRate);
			previousVersion_lazy = () -> CashOptionSD8.mmDeclaredGrossRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
		}

		@Override
		public Optional<PriceFormatSD2Choice> getValue(CashOptionSD9 obj) {
			return obj.getDeclaredGrossRate();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<PriceFormatSD2Choice> value) {
			obj.setDeclaredGrossRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdNetRate")
	protected PriceFormatSD2Choice declaredNetRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDeclaredNetRate
	 * CashOptionSD10.mmDeclaredNetRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDeclaredNetRate
	 * CashOptionSD8.mmDeclaredNetRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<PriceFormatSD2Choice>> mmDeclaredNetRate = new MMMessageAttribute<CashOptionSD9, Optional<PriceFormatSD2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "DclrdNetRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Net Rate"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredNetRate";
			definition = "Net cash rate associated to the payout as declared on the market by the issuer or offeror.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmDeclaredNetRate);
			previousVersion_lazy = () -> CashOptionSD8.mmDeclaredNetRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
		}

		@Override
		public Optional<PriceFormatSD2Choice> getValue(CashOptionSD9 obj) {
			return obj.getDeclaredNetRate();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<PriceFormatSD2Choice> value) {
			obj.setDeclaredNetRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrdFeeRate")
	protected PriceFormatSD2Choice declaredFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormatSD2Choice
	 * PriceFormatSD2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDeclaredFeeRate
	 * CashOptionSD10.mmDeclaredFeeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDeclaredFeeRate
	 * CashOptionSD8.mmDeclaredFeeRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<PriceFormatSD2Choice>> mmDeclaredFeeRate = new MMMessageAttribute<CashOptionSD9, Optional<PriceFormatSD2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "DclrdFeeRate";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Declared Fee Rate"), new DTCCSynonym(this, "Currency (Declared Fee Rate)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclaredFeeRate";
			definition = "Rate at which the fee will be charged to a DTC participant.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmDeclaredFeeRate);
			previousVersion_lazy = () -> CashOptionSD8.mmDeclaredFeeRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormatSD2Choice.mmObject();
		}

		@Override
		public Optional<PriceFormatSD2Choice> getValue(CashOptionSD9 obj) {
			return obj.getDeclaredFeeRate();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<PriceFormatSD2Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmDTCUSTaxInstructionPeriod
	 * CashOptionSD10.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmDTCUSTaxInstructionPeriod
	 * CashOptionSD8.mmDTCUSTaxInstructionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<Period3>> mmDTCUSTaxInstructionPeriod = new MMMessageAttribute<CashOptionSD9, Optional<Period3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "DTCUSTaxInstrPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "DTC NRA Tax Instruction Expiration Date"), new DTCCSynonym(this, "DTC NRA Tax Instruction Start Date"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCUSTaxInstructionPeriod";
			definition = "Indicates the period during which the instructions for DTC (The Depository Trust Corporation) US Tax service will be accepted.";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmDTCUSTaxInstructionPeriod);
			previousVersion_lazy = () -> CashOptionSD8.mmDTCUSTaxInstructionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period3.mmObject();
		}

		@Override
		public Optional<Period3> getValue(CashOptionSD9 obj) {
			return obj.getDTCUSTaxInstructionPeriod();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<Period3> value) {
			obj.setDTCUSTaxInstructionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "RDPRefNb")
	protected Exact32AlphaNumericText rDPReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact32AlphaNumericText
	 * Exact32AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD9 CashOptionSD9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RDPRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RDPReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files. For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option. Also, usage rules will specify the different layouts of the RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD10#mmRDPReferenceNumber
	 * CashOptionSD10.mmRDPReferenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOptionSD8#mmRDPReferenceNumber
	 * CashOptionSD8.mmRDPReferenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOptionSD9, Optional<Exact32AlphaNumericText>> mmRDPReferenceNumber = new MMMessageAttribute<CashOptionSD9, Optional<Exact32AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOptionSD9.mmObject();
			isDerived = false;
			xmlTag = "RDPRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RDPReferenceNumber";
			definition = "Unique DTCC legacy reference used for matching and reconciling legacy CCF records. The element will be populated to all levels of the message (Event Details, Options, Movements) where applicable to indicate how values are sourced from CCF legacy files. For example: event has 2 related Activity Types 74, and 54. If event details and cash option are sourced from the Activity Type 74, then Activity Type 74 will be in RDP Reference Number in event details, and also on the cash option. The activity type 54 will be \"on\" the security option. Also, usage rules will specify the different layouts of the RDP Reference Number based on DTCC event group (reorganization, distribution, or redemption).";
			nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmRDPReferenceNumber);
			previousVersion_lazy = () -> CashOptionSD8.mmRDPReferenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact32AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact32AlphaNumericText> getValue(CashOptionSD9 obj) {
			return obj.getRDPReferenceNumber();
		}

		@Override
		public void setValue(CashOptionSD9 obj, Optional<Exact32AlphaNumericText> value) {
			obj.setRDPReferenceNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOptionSD9.mmPlaceAndName, com.tools20022.repository.msg.CashOptionSD9.mmPayoutType, com.tools20022.repository.msg.CashOptionSD9.mmDTCPayMethod,
						com.tools20022.repository.msg.CashOptionSD9.mmDTCPayOrder, com.tools20022.repository.msg.CashOptionSD9.mmEntitlementCalculationMethod, com.tools20022.repository.msg.CashOptionSD9.mmEstimatedRateFlag,
						com.tools20022.repository.msg.CashOptionSD9.mmNRATaxReportableFlag, com.tools20022.repository.msg.CashOptionSD9.mmProtectChargeFlag, com.tools20022.repository.msg.CashOptionSD9.mmDeclaredCashRate,
						com.tools20022.repository.msg.CashOptionSD9.mmDeclaredGrossRate, com.tools20022.repository.msg.CashOptionSD9.mmDeclaredNetRate, com.tools20022.repository.msg.CashOptionSD9.mmDeclaredFeeRate,
						com.tools20022.repository.msg.CashOptionSD9.mmDTCUSTaxInstructionPeriod, com.tools20022.repository.msg.CashOptionSD9.mmRDPReferenceNumber);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashOptionSD9";
				definition = "Provides additional information regarding corporate action option cash movement details.";
				nextVersions_lazy = () -> Arrays.asList(CashOptionSD10.mmObject());
				previousVersion_lazy = () -> CashOptionSD8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CashOptionSD9 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public DTCCPayoutType3Code getPayoutType() {
		return payoutType;
	}

	public CashOptionSD9 setPayoutType(DTCCPayoutType3Code payoutType) {
		this.payoutType = Objects.requireNonNull(payoutType);
		return this;
	}

	public Optional<Max3Text> getDTCPayMethod() {
		return dTCPayMethod == null ? Optional.empty() : Optional.of(dTCPayMethod);
	}

	public CashOptionSD9 setDTCPayMethod(Max3Text dTCPayMethod) {
		this.dTCPayMethod = dTCPayMethod;
		return this;
	}

	public Optional<Max3Text> getDTCPayOrder() {
		return dTCPayOrder == null ? Optional.empty() : Optional.of(dTCPayOrder);
	}

	public CashOptionSD9 setDTCPayOrder(Max3Text dTCPayOrder) {
		this.dTCPayOrder = dTCPayOrder;
		return this;
	}

	public Optional<DTCEntitlementCalculationMethod1Code> getEntitlementCalculationMethod() {
		return entitlementCalculationMethod == null ? Optional.empty() : Optional.of(entitlementCalculationMethod);
	}

	public CashOptionSD9 setEntitlementCalculationMethod(DTCEntitlementCalculationMethod1Code entitlementCalculationMethod) {
		this.entitlementCalculationMethod = entitlementCalculationMethod;
		return this;
	}

	public Optional<YesNoIndicator> getEstimatedRateFlag() {
		return estimatedRateFlag == null ? Optional.empty() : Optional.of(estimatedRateFlag);
	}

	public CashOptionSD9 setEstimatedRateFlag(YesNoIndicator estimatedRateFlag) {
		this.estimatedRateFlag = estimatedRateFlag;
		return this;
	}

	public Optional<YesNoIndicator> getNRATaxReportableFlag() {
		return nRATaxReportableFlag == null ? Optional.empty() : Optional.of(nRATaxReportableFlag);
	}

	public CashOptionSD9 setNRATaxReportableFlag(YesNoIndicator nRATaxReportableFlag) {
		this.nRATaxReportableFlag = nRATaxReportableFlag;
		return this;
	}

	public Optional<YesNoIndicator> getProtectChargeFlag() {
		return protectChargeFlag == null ? Optional.empty() : Optional.of(protectChargeFlag);
	}

	public CashOptionSD9 setProtectChargeFlag(YesNoIndicator protectChargeFlag) {
		this.protectChargeFlag = protectChargeFlag;
		return this;
	}

	public Optional<PriceFormatSD2Choice> getDeclaredCashRate() {
		return declaredCashRate == null ? Optional.empty() : Optional.of(declaredCashRate);
	}

	public CashOptionSD9 setDeclaredCashRate(PriceFormatSD2Choice declaredCashRate) {
		this.declaredCashRate = declaredCashRate;
		return this;
	}

	public Optional<PriceFormatSD2Choice> getDeclaredGrossRate() {
		return declaredGrossRate == null ? Optional.empty() : Optional.of(declaredGrossRate);
	}

	public CashOptionSD9 setDeclaredGrossRate(PriceFormatSD2Choice declaredGrossRate) {
		this.declaredGrossRate = declaredGrossRate;
		return this;
	}

	public Optional<PriceFormatSD2Choice> getDeclaredNetRate() {
		return declaredNetRate == null ? Optional.empty() : Optional.of(declaredNetRate);
	}

	public CashOptionSD9 setDeclaredNetRate(PriceFormatSD2Choice declaredNetRate) {
		this.declaredNetRate = declaredNetRate;
		return this;
	}

	public Optional<PriceFormatSD2Choice> getDeclaredFeeRate() {
		return declaredFeeRate == null ? Optional.empty() : Optional.of(declaredFeeRate);
	}

	public CashOptionSD9 setDeclaredFeeRate(PriceFormatSD2Choice declaredFeeRate) {
		this.declaredFeeRate = declaredFeeRate;
		return this;
	}

	public Optional<Period3> getDTCUSTaxInstructionPeriod() {
		return dTCUSTaxInstructionPeriod == null ? Optional.empty() : Optional.of(dTCUSTaxInstructionPeriod);
	}

	public CashOptionSD9 setDTCUSTaxInstructionPeriod(Period3 dTCUSTaxInstructionPeriod) {
		this.dTCUSTaxInstructionPeriod = dTCUSTaxInstructionPeriod;
		return this;
	}

	public Optional<Exact32AlphaNumericText> getRDPReferenceNumber() {
		return rDPReferenceNumber == null ? Optional.empty() : Optional.of(rDPReferenceNumber);
	}

	public CashOptionSD9 setRDPReferenceNumber(Exact32AlphaNumericText rDPReferenceNumber) {
		this.rDPReferenceNumber = rDPReferenceNumber;
		return this;
	}
}