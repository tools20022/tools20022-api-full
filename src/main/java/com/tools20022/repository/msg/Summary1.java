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
import com.tools20022.repository.codeset.ExposureType1Code;
import com.tools20022.repository.codeset.ShortLong1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.entity.Obligation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information related to the collateral position, that is, the
 * identification of the exposed party, the total exposure amount and the total
 * collateral amount held by the taker. It also contains the valuation dates and
 * the requested settlement date of collateral if there is a shortage of
 * collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Summary1#mmExposedAmountPartyA
 * Summary1.mmExposedAmountPartyA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Summary1#mmExposedAmountPartyB
 * Summary1.mmExposedAmountPartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Summary1#mmExposureType
 * Summary1.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Summary1#mmTotalValueOfCollateral
 * Summary1.mmTotalValueOfCollateral}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Summary1#mmNetExcessDeficit
 * Summary1.mmNetExcessDeficit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Summary1#mmNetExcessDeficitIndicator
 * Summary1.mmNetExcessDeficitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Summary1#mmValuationDateTime
 * Summary1.mmValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Summary1#mmRequestedSettlementDate
 * Summary1.mmRequestedSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Summary1#mmSummaryDetails
 * Summary1.mmSummaryDetails}</li>
 * </ul>
 * </li>
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
 * "Summary1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information related to the collateral position, that is, the identification of the exposed party, the total exposure amount and the total collateral amount held by the taker. It also contains the valuation dates and the requested settlement date of collateral if there is a shortage of collateral."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Summary1", propOrder = {"exposedAmountPartyA", "exposedAmountPartyB", "exposureType", "totalValueOfCollateral", "netExcessDeficit", "netExcessDeficitIndicator", "valuationDateTime", "requestedSettlementDate",
		"summaryDetails"})
public class Summary1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount exposedAmountPartyA;
	/**
	 * Sum of the exposures of all transactions which are in the favour of party
	 * A. That is, all transactions which would have an amount payable by party
	 * B to party A if they were being terminated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalExposedAmount
	 * ExposureCalculation.mmTotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Summary1
	 * Summary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsdAmtPtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposedAmountPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the exposures of all transactions which are in the favour of party A. That is, all transactions which would have an amount payable by party B to party A if they were being terminated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExposedAmountPartyA = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> Summary1.mmObject();
			isDerived = false;
			xmlTag = "XpsdAmtPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmountPartyA";
			definition = "Sum of the exposures of all transactions which are in the favour of party A. That is, all transactions which would have an amount payable by party B to party A if they were being terminated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount exposedAmountPartyB;
	/**
	 * Sum of the exposures of all transactions which are in the favour of party
	 * B. That is, all transactions which would have an amount payable by party
	 * A to party B if they were being terminated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalExposedAmount
	 * ExposureCalculation.mmTotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Summary1
	 * Summary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsdAmtPtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposedAmountPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the exposures of all transactions which are in the favour of party B. That is, all transactions which would have an amount payable by party A to party B if they were being terminated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExposedAmountPartyB = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> Summary1.mmObject();
			isDerived = false;
			xmlTag = "XpsdAmtPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmountPartyB";
			definition = "Sum of the exposures of all transactions which are in the favour of party B. That is, all transactions which would have an amount payable by party A to party B if they were being terminated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ExposureType1Code exposureType;
	/**
	 * Specifies the underlying business area/type of trade that triggered the
	 * posting of collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureType1Code
	 * ExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
	 * ExposureTerm.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Summary1
	 * Summary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area/type of trade that triggered the posting of collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExposureType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmExposureType;
			componentContext_lazy = () -> Summary1.mmObject();
			isDerived = false;
			xmlTag = "XpsrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade that triggered the posting of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureType1Code.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalValueOfCollateral;
	/**
	 * Total value of the collateral (post-haircut) held by the exposed party
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralCurrentValue
	 * ExposureCalculation.mmTotalCollateralCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Summary1
	 * Summary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlValOfColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalValueOfCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the collateral (post-haircut) held by the exposed party"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalValueOfCollateral = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> Summary1.mmObject();
			isDerived = false;
			xmlTag = "TtlValOfColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalValueOfCollateral";
			definition = "Total value of the collateral (post-haircut) held by the exposed party";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount netExcessDeficit;
	/**
	 * Specifies the amount of collateral in excess or deficit compared to the
	 * exposure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Summary1
	 * Summary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetXcssDfcit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetExcessDeficit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount of collateral in excess or deficit compared to the exposure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetExcessDeficit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Summary1.mmObject();
			isDerived = false;
			xmlTag = "NetXcssDfcit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetExcessDeficit";
			definition = "Specifies the amount of collateral in excess or deficit compared to the exposure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ShortLong1Code netExcessDeficitIndicator;
	/**
	 * Indicates whether the collateral actually posted is a long or a short
	 * position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLong1Code
	 * ShortLong1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Summary1
	 * Summary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetXcssDfcitInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetExcessDeficitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the collateral actually posted is a long or a short position."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetExcessDeficitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Summary1.mmObject();
			isDerived = false;
			xmlTag = "NetXcssDfcitInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetExcessDeficitIndicator";
			definition = "Indicates whether the collateral actually posted is a long or a short position.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ShortLong1Code.mmObject();
		}
	};
	protected ISODateTime valuationDateTime;
	/**
	 * Date/time at which the collateral was valued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarginCallValuationDate
	 * MarginCall.mmMarginCallValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Summary1
	 * Summary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the collateral was valued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValuationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmMarginCallValuationDate;
			componentContext_lazy = () -> Summary1.mmObject();
			isDerived = false;
			xmlTag = "ValtnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDateTime";
			definition = "Date/time at which the collateral was valued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODate requestedSettlementDate;
	/**
	 * Date on which the instructing party requests settlement of the collateral
	 * to take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Summary1
	 * Summary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the instructing party requests settlement of the collateral to take place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> Summary1.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date on which the instructing party requests settlement of the collateral to take place.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected SummaryAmounts1 summaryDetails;
	/**
	 * Provides the more details on the valuation of the collateral that is
	 * posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Summary1
	 * Summary1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SummryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SummaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the more details on the valuation of the collateral that is posted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSummaryDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Summary1.mmObject();
			isDerived = false;
			xmlTag = "SummryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SummaryDetails";
			definition = "Provides the more details on the valuation of the collateral that is posted.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Summary1.mmExposedAmountPartyA, Summary1.mmExposedAmountPartyB, Summary1.mmExposureType, Summary1.mmTotalValueOfCollateral, Summary1.mmNetExcessDeficit,
						Summary1.mmNetExcessDeficitIndicator, Summary1.mmValuationDateTime, Summary1.mmRequestedSettlementDate, Summary1.mmSummaryDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Summary1";
				definition = "Provides information related to the collateral position, that is, the identification of the exposed party, the total exposure amount and the total collateral amount held by the taker. It also contains the valuation dates and the requested settlement date of collateral if there is a shortage of collateral.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "XpsdAmtPtyA")
	public ActiveCurrencyAndAmount getExposedAmountPartyA() {
		return exposedAmountPartyA;
	}

	public void setExposedAmountPartyA(ActiveCurrencyAndAmount exposedAmountPartyA) {
		this.exposedAmountPartyA = exposedAmountPartyA;
	}

	@XmlElement(name = "XpsdAmtPtyB")
	public ActiveCurrencyAndAmount getExposedAmountPartyB() {
		return exposedAmountPartyB;
	}

	public void setExposedAmountPartyB(ActiveCurrencyAndAmount exposedAmountPartyB) {
		this.exposedAmountPartyB = exposedAmountPartyB;
	}

	@XmlElement(name = "XpsrTp", required = true)
	public ExposureType1Code getExposureType() {
		return exposureType;
	}

	public void setExposureType(ExposureType1Code exposureType) {
		this.exposureType = exposureType;
	}

	@XmlElement(name = "TtlValOfColl", required = true)
	public ActiveCurrencyAndAmount getTotalValueOfCollateral() {
		return totalValueOfCollateral;
	}

	public void setTotalValueOfCollateral(ActiveCurrencyAndAmount totalValueOfCollateral) {
		this.totalValueOfCollateral = totalValueOfCollateral;
	}

	@XmlElement(name = "NetXcssDfcit")
	public ActiveCurrencyAndAmount getNetExcessDeficit() {
		return netExcessDeficit;
	}

	public void setNetExcessDeficit(ActiveCurrencyAndAmount netExcessDeficit) {
		this.netExcessDeficit = netExcessDeficit;
	}

	@XmlElement(name = "NetXcssDfcitInd")
	public ShortLong1Code getNetExcessDeficitIndicator() {
		return netExcessDeficitIndicator;
	}

	public void setNetExcessDeficitIndicator(ShortLong1Code netExcessDeficitIndicator) {
		this.netExcessDeficitIndicator = netExcessDeficitIndicator;
	}

	@XmlElement(name = "ValtnDtTm", required = true)
	public ISODateTime getValuationDateTime() {
		return valuationDateTime;
	}

	public void setValuationDateTime(ISODateTime valuationDateTime) {
		this.valuationDateTime = valuationDateTime;
	}

	@XmlElement(name = "ReqdSttlmDt")
	public ISODate getRequestedSettlementDate() {
		return requestedSettlementDate;
	}

	public void setRequestedSettlementDate(ISODate requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
	}

	@XmlElement(name = "SummryDtls")
	public SummaryAmounts1 getSummaryDetails() {
		return summaryDetails;
	}

	public void setSummaryDetails(com.tools20022.repository.msg.SummaryAmounts1 summaryDetails) {
		this.summaryDetails = summaryDetails;
	}
}