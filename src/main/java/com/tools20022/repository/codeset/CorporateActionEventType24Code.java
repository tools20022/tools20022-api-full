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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionEventType24Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#ActiveTradingStatus
 * CorporateActionEventType24Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Attachment
 * CorporateActionEventType24Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Bankruptcy
 * CorporateActionEventType24Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#BondDefault
 * CorporateActionEventType24Code.BondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#BonusIssue
 * CorporateActionEventType24Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#CallOnIntermediateSecurities
 * CorporateActionEventType24Code.CallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#CapitalDistribution
 * CorporateActionEventType24Code.CapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#CapitalGainsDistribution
 * CorporateActionEventType24Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Capitalisation
 * CorporateActionEventType24Code.Capitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventType24Code.CashDistributionFromNonEligibleSecuritiesSales
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#CashDividend
 * CorporateActionEventType24Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Change
 * CorporateActionEventType24Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#CompanyOption
 * CorporateActionEventType24Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#ClassActionProposedSettlement
 * CorporateActionEventType24Code.ClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Consent
 * CorporateActionEventType24Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Conversion
 * CorporateActionEventType24Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#CreditEvent
 * CorporateActionEventType24Code.CreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#DecreaseInValue
 * CorporateActionEventType24Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Detachment
 * CorporateActionEventType24Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Disclosure
 * CorporateActionEventType24Code.Disclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#DividendOption
 * CorporateActionEventType24Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#DividendReinvestment
 * CorporateActionEventType24Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Drawing
 * CorporateActionEventType24Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#DutchAuction
 * CorporateActionEventType24Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Exchange
 * CorporateActionEventType24Code.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#FinalMaturity
 * CorporateActionEventType24Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#FullCall
 * CorporateActionEventType24Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#IncreaseInValue
 * CorporateActionEventType24Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#InstalmentCall
 * CorporateActionEventType24Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#InterestPayment
 * CorporateActionEventType24Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#InterestPaymentWithPrincipal
 * CorporateActionEventType24Code.InterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#IntermediateSecuritiesDistribution
 * CorporateActionEventType24Code.IntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#LiquidationDividend
 * CorporateActionEventType24Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#MaturityExtension
 * CorporateActionEventType24Code.MaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Merger
 * CorporateActionEventType24Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#NonOfficialOffer
 * CorporateActionEventType24Code.NonOfficialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#NonUSTEFRADCertification
 * CorporateActionEventType24Code.NonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#OddLotSalePurchase
 * CorporateActionEventType24Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#OtherEvent
 * CorporateActionEventType24Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#PariPassu
 * CorporateActionEventType24Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#PartialRedemptionWithoutPoolFactorReduction
 * CorporateActionEventType24Code.PartialRedemptionWithoutPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#PartialRedemptionWithPoolFactorReduction
 * CorporateActionEventType24Code.PartialRedemptionWithPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#PayInKind
 * CorporateActionEventType24Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#PlaceOfIncorporation
 * CorporateActionEventType24Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Prefunding
 * CorporateActionEventType24Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#PriorityIssue
 * CorporateActionEventType24Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#PutRedemption
 * CorporateActionEventType24Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Redenomination
 * CorporateActionEventType24Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#RemarketingAgreement
 * CorporateActionEventType24Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#RepurchaseOffer
 * CorporateActionEventType24Code.RepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#ReverseStockSplit
 * CorporateActionEventType24Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#RightsIssue
 * CorporateActionEventType24Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#ScripDividend
 * CorporateActionEventType24Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#SharesPremiumDividend
 * CorporateActionEventType24Code.SharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#SmallestNegotiableUnit
 * CorporateActionEventType24Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#SpinOff
 * CorporateActionEventType24Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#StockDividend
 * CorporateActionEventType24Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#StockSplit
 * CorporateActionEventType24Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#TaxReclaim
 * CorporateActionEventType24Code.TaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Tender
 * CorporateActionEventType24Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#TradingStatusDelisted
 * CorporateActionEventType24Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#TradingStatusSuspended
 * CorporateActionEventType24Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#WarrantExercise
 * CorporateActionEventType24Code.WarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#WithholdingTaxReliefCertification
 * CorporateActionEventType24Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Worthless
 * CorporateActionEventType24Code.Worthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Accumulation
 * CorporateActionEventType24Code.Accumulation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#SecuritiesHoldersMeeting
 * CorporateActionEventType24Code.SecuritiesHoldersMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code#Information
 * CorporateActionEventType24Code.Information}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
 * CorporateActionEventTypeV6Code}</li>
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
 * "CorporateActionEventType24Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code
 * CorporateActionEventType28Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType24Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#ActiveTradingStatus
	 * CorporateActionEventType28Code.ActiveTradingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code ActiveTradingStatus = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.ActiveTradingStatus);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ActiveTradingStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Attachment
	 * CorporateActionEventType28Code.Attachment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Attachment = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Attachment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Attachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Bankruptcy
	 * CorporateActionEventType28Code.Bankruptcy}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Bankruptcy = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Bankruptcy);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondDefault"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#BondDefault
	 * CorporateActionEventType28Code.BondDefault}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code BondDefault = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.BondDefault);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BondDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#BonusIssue
	 * CorporateActionEventType28Code.BonusIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code BonusIssue = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.BonusIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnIntermediateSecurities"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#CallOnIntermediateSecurities
	 * CorporateActionEventType28Code.CallOnIntermediateSecurities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code CallOnIntermediateSecurities = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.CallOnIntermediateSecurities);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CallOnIntermediateSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalDistribution"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#CapitalDistribution
	 * CorporateActionEventType28Code.CapitalDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code CapitalDistribution = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.CapitalDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#CapitalGainsDistribution
	 * CorporateActionEventType28Code.CapitalGainsDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code CapitalGainsDistribution = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.CapitalGainsDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalGainsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capitalisation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Capitalisation
	 * CorporateActionEventType28Code.Capitalisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Capitalisation = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Capitalisation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Capitalisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionFromNonEligibleSecuritiesSales"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#CashDistributionFromNonEligibleSecuritiesSales
	 * CorporateActionEventType28Code.
	 * CashDistributionFromNonEligibleSecuritiesSales}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.CashDistributionFromNonEligibleSecuritiesSales);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDistributionFromNonEligibleSecuritiesSales.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#CashDividend
	 * CorporateActionEventType28Code.CashDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code CashDividend = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.CashDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Change
	 * CorporateActionEventType28Code.Change}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Change = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Change);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#CompanyOption
	 * CorporateActionEventType28Code.CompanyOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code CompanyOption = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.CompanyOption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CompanyOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionProposedSettlement"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#ClassActionProposedSettlement
	 * CorporateActionEventType28Code.ClassActionProposedSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code ClassActionProposedSettlement = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.ClassActionProposedSettlement);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ClassActionProposedSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Consent
	 * CorporateActionEventType28Code.Consent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Consent = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Consent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Consent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Conversion
	 * CorporateActionEventType28Code.Conversion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Conversion = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Conversion);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Conversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEvent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#CreditEvent
	 * CorporateActionEventType28Code.CreditEvent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code CreditEvent = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.CreditEvent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CreditEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#DecreaseInValue
	 * CorporateActionEventType28Code.DecreaseInValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code DecreaseInValue = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.DecreaseInValue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Detachment
	 * CorporateActionEventType28Code.Detachment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Detachment = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Detachment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Detachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclosure"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Disclosure
	 * CorporateActionEventType28Code.Disclosure}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Disclosure = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Disclosure);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Disclosure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#DividendOption
	 * CorporateActionEventType28Code.DividendOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code DividendOption = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.DividendOption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#DividendReinvestment
	 * CorporateActionEventType28Code.DividendReinvestment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code DividendReinvestment = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.DividendReinvestment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Drawing
	 * CorporateActionEventType28Code.Drawing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Drawing = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Drawing);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Drawing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#DutchAuction
	 * CorporateActionEventType28Code.DutchAuction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code DutchAuction = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.DutchAuction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DutchAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Exchange
	 * CorporateActionEventType28Code.Exchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Exchange = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Exchange);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Exchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#FinalMaturity
	 * CorporateActionEventType28Code.FinalMaturity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code FinalMaturity = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.FinalMaturity);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FinalMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#FullCall
	 * CorporateActionEventType28Code.FullCall}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code FullCall = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.FullCall);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FullCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#IncreaseInValue
	 * CorporateActionEventType28Code.IncreaseInValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code IncreaseInValue = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.IncreaseInValue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IncreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#InstalmentCall
	 * CorporateActionEventType28Code.InstalmentCall}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code InstalmentCall = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.InstalmentCall);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InstalmentCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#InterestPayment
	 * CorporateActionEventType28Code.InterestPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code InterestPayment = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.InterestPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentWithPrincipal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#InterestPaymentWithPrincipal
	 * CorporateActionEventType28Code.InterestPaymentWithPrincipal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code InterestPaymentWithPrincipal = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.InterestPaymentWithPrincipal);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPaymentWithPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#IntermediateSecuritiesDistribution
	 * CorporateActionEventType28Code.IntermediateSecuritiesDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code IntermediateSecuritiesDistribution = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.IntermediateSecuritiesDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IntermediateSecuritiesDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#LiquidationDividend
	 * CorporateActionEventType28Code.LiquidationDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code LiquidationDividend = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.LiquidationDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.LiquidationDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityExtension"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#MaturityExtension
	 * CorporateActionEventType28Code.MaturityExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code MaturityExtension = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.MaturityExtension);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.MaturityExtension.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Merger
	 * CorporateActionEventType28Code.Merger}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Merger = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Merger);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonOfficialOffer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#NonOfficialOffer
	 * CorporateActionEventType28Code.NonOfficialOffer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code NonOfficialOffer = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOfficialOffer";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.NonOfficialOffer);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonOfficialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUSTEFRADCertification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#NonUSTEFRADCertification
	 * CorporateActionEventType28Code.NonUSTEFRADCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code NonUSTEFRADCertification = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.NonUSTEFRADCertification);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonUSTEFRADCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#OddLotSalePurchase
	 * CorporateActionEventType28Code.OddLotSalePurchase}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code OddLotSalePurchase = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.OddLotSalePurchase);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OddLotSalePurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#OtherEvent
	 * CorporateActionEventType28Code.OtherEvent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code OtherEvent = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.OtherEvent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OtherEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#PariPassu
	 * CorporateActionEventType28Code.PariPassu}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code PariPassu = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.PariPassu);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PariPassu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutPoolFactorReduction"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#PartialRedemptionWithoutPoolFactorReduction
	 * CorporateActionEventType28Code.
	 * PartialRedemptionWithoutPoolFactorReduction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code PartialRedemptionWithoutPoolFactorReduction = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutPoolFactorReduction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.PartialRedemptionWithoutPoolFactorReduction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithoutPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithPoolFactorReduction"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#PartialRedemptionWithPoolFactorReduction
	 * CorporateActionEventType28Code.PartialRedemptionWithPoolFactorReduction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code PartialRedemptionWithPoolFactorReduction = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithPoolFactorReduction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.PartialRedemptionWithPoolFactorReduction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#PayInKind
	 * CorporateActionEventType28Code.PayInKind}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code PayInKind = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.PayInKind);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PayInKind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#PlaceOfIncorporation
	 * CorporateActionEventType28Code.PlaceOfIncorporation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code PlaceOfIncorporation = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.PlaceOfIncorporation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PlaceOfIncorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Prefunding
	 * CorporateActionEventType28Code.Prefunding}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Prefunding = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Prefunding);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Prefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#PriorityIssue
	 * CorporateActionEventType28Code.PriorityIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code PriorityIssue = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.PriorityIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PriorityIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#PutRedemption
	 * CorporateActionEventType28Code.PutRedemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code PutRedemption = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.PutRedemption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Redenomination
	 * CorporateActionEventType28Code.Redenomination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Redenomination = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Redenomination);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#RemarketingAgreement
	 * CorporateActionEventType28Code.RemarketingAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code RemarketingAgreement = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.RemarketingAgreement);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RemarketingAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseOffer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#RepurchaseOffer
	 * CorporateActionEventType28Code.RepurchaseOffer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code RepurchaseOffer = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.RepurchaseOffer);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RepurchaseOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#ReverseStockSplit
	 * CorporateActionEventType28Code.ReverseStockSplit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code ReverseStockSplit = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.ReverseStockSplit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#RightsIssue
	 * CorporateActionEventType28Code.RightsIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code RightsIssue = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.RightsIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#ScripDividend
	 * CorporateActionEventType28Code.ScripDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code ScripDividend = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.ScripDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ScripDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesPremiumDividend"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#SharesPremiumDividend
	 * CorporateActionEventType28Code.SharesPremiumDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code SharesPremiumDividend = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.SharesPremiumDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SharesPremiumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#SmallestNegotiableUnit
	 * CorporateActionEventType28Code.SmallestNegotiableUnit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code SmallestNegotiableUnit = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.SmallestNegotiableUnit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SmallestNegotiableUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#SpinOff
	 * CorporateActionEventType28Code.SpinOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code SpinOff = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.SpinOff);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#StockDividend
	 * CorporateActionEventType28Code.StockDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code StockDividend = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.StockDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#StockSplit
	 * CorporateActionEventType28Code.StockSplit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code StockSplit = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.StockSplit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#TaxReclaim
	 * CorporateActionEventType28Code.TaxReclaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code TaxReclaim = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.TaxReclaim);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TaxReclaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Tender
	 * CorporateActionEventType28Code.Tender}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Tender = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Tender);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#TradingStatusDelisted
	 * CorporateActionEventType28Code.TradingStatusDelisted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code TradingStatusDelisted = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.TradingStatusDelisted);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusDelisted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#TradingStatusSuspended
	 * CorporateActionEventType28Code.TradingStatusSuspended}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code TradingStatusSuspended = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.TradingStatusSuspended);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusSuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantExercise"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#WarrantExercise
	 * CorporateActionEventType28Code.WarrantExercise}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code WarrantExercise = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.WarrantExercise);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WarrantExercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#WithholdingTaxReliefCertification
	 * CorporateActionEventType28Code.WithholdingTaxReliefCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code WithholdingTaxReliefCertification = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.WithholdingTaxReliefCertification);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WithholdingTaxReliefCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Worthless
	 * CorporateActionEventType28Code.Worthless}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Worthless = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Worthless);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Worthless.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Accumulation
	 * CorporateActionEventType28Code.Accumulation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Accumulation = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Accumulation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Accumulation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHoldersMeeting"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#SecuritiesHoldersMeeting
	 * CorporateActionEventType28Code.SecuritiesHoldersMeeting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code SecuritiesHoldersMeeting = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHoldersMeeting";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.SecuritiesHoldersMeeting);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SecuritiesHoldersMeeting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
	 * CorporateActionEventType24Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType28Code#Information
	 * CorporateActionEventType28Code.Information}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType24Code Information = new CorporateActionEventType24Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.Information);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType24Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Information.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType24Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType24Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType24Code";
				definition = "Specifies the corporate action event type.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType28Code.mmObject());
				trace_lazy = () -> CorporateActionEventTypeV6Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType24Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventType24Code.Attachment,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Bankruptcy, com.tools20022.repository.codeset.CorporateActionEventType24Code.BondDefault,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventType24Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventType24Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Capitalisation, com.tools20022.repository.codeset.CorporateActionEventType24Code.CashDistributionFromNonEligibleSecuritiesSales,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventType24Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventType24Code.ClassActionProposedSettlement,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Consent, com.tools20022.repository.codeset.CorporateActionEventType24Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.CreditEvent, com.tools20022.repository.codeset.CorporateActionEventType24Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventType24Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.DividendOption, com.tools20022.repository.codeset.CorporateActionEventType24Code.DividendReinvestment,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventType24Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventType24Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.FullCall, com.tools20022.repository.codeset.CorporateActionEventType24Code.IncreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.InstalmentCall, com.tools20022.repository.codeset.CorporateActionEventType24Code.InterestPayment,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.InterestPaymentWithPrincipal, com.tools20022.repository.codeset.CorporateActionEventType24Code.IntermediateSecuritiesDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.LiquidationDividend, com.tools20022.repository.codeset.CorporateActionEventType24Code.MaturityExtension,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Merger, com.tools20022.repository.codeset.CorporateActionEventType24Code.NonOfficialOffer,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.NonUSTEFRADCertification, com.tools20022.repository.codeset.CorporateActionEventType24Code.OddLotSalePurchase,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventType24Code.PariPassu,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.PartialRedemptionWithoutPoolFactorReduction,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.PartialRedemptionWithPoolFactorReduction, com.tools20022.repository.codeset.CorporateActionEventType24Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventType24Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.PriorityIssue, com.tools20022.repository.codeset.CorporateActionEventType24Code.PutRedemption,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType24Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventType24Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.RightsIssue, com.tools20022.repository.codeset.CorporateActionEventType24Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventType24Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventType24Code.StockDividend,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventType24Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Tender, com.tools20022.repository.codeset.CorporateActionEventType24Code.TradingStatusDelisted,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.TradingStatusSuspended, com.tools20022.repository.codeset.CorporateActionEventType24Code.WarrantExercise,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.WithholdingTaxReliefCertification, com.tools20022.repository.codeset.CorporateActionEventType24Code.Worthless,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Accumulation, com.tools20022.repository.codeset.CorporateActionEventType24Code.SecuritiesHoldersMeeting,
						com.tools20022.repository.codeset.CorporateActionEventType24Code.Information);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ActiveTradingStatus.getCodeName().get(), ActiveTradingStatus);
		codesByName.put(Attachment.getCodeName().get(), Attachment);
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(BondDefault.getCodeName().get(), BondDefault);
		codesByName.put(BonusIssue.getCodeName().get(), BonusIssue);
		codesByName.put(CallOnIntermediateSecurities.getCodeName().get(), CallOnIntermediateSecurities);
		codesByName.put(CapitalDistribution.getCodeName().get(), CapitalDistribution);
		codesByName.put(CapitalGainsDistribution.getCodeName().get(), CapitalGainsDistribution);
		codesByName.put(Capitalisation.getCodeName().get(), Capitalisation);
		codesByName.put(CashDistributionFromNonEligibleSecuritiesSales.getCodeName().get(), CashDistributionFromNonEligibleSecuritiesSales);
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(Change.getCodeName().get(), Change);
		codesByName.put(CompanyOption.getCodeName().get(), CompanyOption);
		codesByName.put(ClassActionProposedSettlement.getCodeName().get(), ClassActionProposedSettlement);
		codesByName.put(Consent.getCodeName().get(), Consent);
		codesByName.put(Conversion.getCodeName().get(), Conversion);
		codesByName.put(CreditEvent.getCodeName().get(), CreditEvent);
		codesByName.put(DecreaseInValue.getCodeName().get(), DecreaseInValue);
		codesByName.put(Detachment.getCodeName().get(), Detachment);
		codesByName.put(Disclosure.getCodeName().get(), Disclosure);
		codesByName.put(DividendOption.getCodeName().get(), DividendOption);
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(Drawing.getCodeName().get(), Drawing);
		codesByName.put(DutchAuction.getCodeName().get(), DutchAuction);
		codesByName.put(Exchange.getCodeName().get(), Exchange);
		codesByName.put(FinalMaturity.getCodeName().get(), FinalMaturity);
		codesByName.put(FullCall.getCodeName().get(), FullCall);
		codesByName.put(IncreaseInValue.getCodeName().get(), IncreaseInValue);
		codesByName.put(InstalmentCall.getCodeName().get(), InstalmentCall);
		codesByName.put(InterestPayment.getCodeName().get(), InterestPayment);
		codesByName.put(InterestPaymentWithPrincipal.getCodeName().get(), InterestPaymentWithPrincipal);
		codesByName.put(IntermediateSecuritiesDistribution.getCodeName().get(), IntermediateSecuritiesDistribution);
		codesByName.put(LiquidationDividend.getCodeName().get(), LiquidationDividend);
		codesByName.put(MaturityExtension.getCodeName().get(), MaturityExtension);
		codesByName.put(Merger.getCodeName().get(), Merger);
		codesByName.put(NonOfficialOffer.getCodeName().get(), NonOfficialOffer);
		codesByName.put(NonUSTEFRADCertification.getCodeName().get(), NonUSTEFRADCertification);
		codesByName.put(OddLotSalePurchase.getCodeName().get(), OddLotSalePurchase);
		codesByName.put(OtherEvent.getCodeName().get(), OtherEvent);
		codesByName.put(PariPassu.getCodeName().get(), PariPassu);
		codesByName.put(PartialRedemptionWithoutPoolFactorReduction.getCodeName().get(), PartialRedemptionWithoutPoolFactorReduction);
		codesByName.put(PartialRedemptionWithPoolFactorReduction.getCodeName().get(), PartialRedemptionWithPoolFactorReduction);
		codesByName.put(PayInKind.getCodeName().get(), PayInKind);
		codesByName.put(PlaceOfIncorporation.getCodeName().get(), PlaceOfIncorporation);
		codesByName.put(Prefunding.getCodeName().get(), Prefunding);
		codesByName.put(PriorityIssue.getCodeName().get(), PriorityIssue);
		codesByName.put(PutRedemption.getCodeName().get(), PutRedemption);
		codesByName.put(Redenomination.getCodeName().get(), Redenomination);
		codesByName.put(RemarketingAgreement.getCodeName().get(), RemarketingAgreement);
		codesByName.put(RepurchaseOffer.getCodeName().get(), RepurchaseOffer);
		codesByName.put(ReverseStockSplit.getCodeName().get(), ReverseStockSplit);
		codesByName.put(RightsIssue.getCodeName().get(), RightsIssue);
		codesByName.put(ScripDividend.getCodeName().get(), ScripDividend);
		codesByName.put(SharesPremiumDividend.getCodeName().get(), SharesPremiumDividend);
		codesByName.put(SmallestNegotiableUnit.getCodeName().get(), SmallestNegotiableUnit);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(TaxReclaim.getCodeName().get(), TaxReclaim);
		codesByName.put(Tender.getCodeName().get(), Tender);
		codesByName.put(TradingStatusDelisted.getCodeName().get(), TradingStatusDelisted);
		codesByName.put(TradingStatusSuspended.getCodeName().get(), TradingStatusSuspended);
		codesByName.put(WarrantExercise.getCodeName().get(), WarrantExercise);
		codesByName.put(WithholdingTaxReliefCertification.getCodeName().get(), WithholdingTaxReliefCertification);
		codesByName.put(Worthless.getCodeName().get(), Worthless);
		codesByName.put(Accumulation.getCodeName().get(), Accumulation);
		codesByName.put(SecuritiesHoldersMeeting.getCodeName().get(), SecuritiesHoldersMeeting);
		codesByName.put(Information.getCodeName().get(), Information);
	}

	public static CorporateActionEventType24Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType24Code[] values() {
		CorporateActionEventType24Code[] values = new CorporateActionEventType24Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType24Code> {
		@Override
		public CorporateActionEventType24Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType24Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}