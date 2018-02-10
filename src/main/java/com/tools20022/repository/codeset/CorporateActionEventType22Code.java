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
import com.tools20022.repository.codeset.CorporateActionEventType22Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#ActiveTradingStatus
 * CorporateActionEventType22Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Attachment
 * CorporateActionEventType22Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Bankruptcy
 * CorporateActionEventType22Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#BondDefault
 * CorporateActionEventType22Code.BondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#BonusIssue
 * CorporateActionEventType22Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CallOnIntermediateSecurities
 * CorporateActionEventType22Code.CallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CapitalDistribution
 * CorporateActionEventType22Code.CapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CapitalGainsDistribution
 * CorporateActionEventType22Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Capitalisation
 * CorporateActionEventType22Code.Capitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventType22Code.CashDistributionFromNonEligibleSecuritiesSales
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CashDividend
 * CorporateActionEventType22Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Change
 * CorporateActionEventType22Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CompanyOption
 * CorporateActionEventType22Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#ClassActionProposedSettlement
 * CorporateActionEventType22Code.ClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Consent
 * CorporateActionEventType22Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Conversion
 * CorporateActionEventType22Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CreditEvent
 * CorporateActionEventType22Code.CreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#DecreaseInValue
 * CorporateActionEventType22Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Detachment
 * CorporateActionEventType22Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Disclosure
 * CorporateActionEventType22Code.Disclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#DividendOption
 * CorporateActionEventType22Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#DividendReinvestment
 * CorporateActionEventType22Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Drawing
 * CorporateActionEventType22Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#DutchAuction
 * CorporateActionEventType22Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Exchange
 * CorporateActionEventType22Code.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#FinalMaturity
 * CorporateActionEventType22Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#FullCall
 * CorporateActionEventType22Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#IncreaseInValue
 * CorporateActionEventType22Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#InstalmentCall
 * CorporateActionEventType22Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#InterestPayment
 * CorporateActionEventType22Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#InterestPaymentWithPrincipal
 * CorporateActionEventType22Code.InterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#IntermediateSecuritiesDistribution
 * CorporateActionEventType22Code.IntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#LiquidationDividend
 * CorporateActionEventType22Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#MaturityExtension
 * CorporateActionEventType22Code.MaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Merger
 * CorporateActionEventType22Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#NonOfficialOffer
 * CorporateActionEventType22Code.NonOfficialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#NonUSTEFRADCertification
 * CorporateActionEventType22Code.NonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#OddLotSalePurchase
 * CorporateActionEventType22Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#OtherEvent
 * CorporateActionEventType22Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PariPassu
 * CorporateActionEventType22Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PartialRedemptionWithoutPoolFactorReduction
 * CorporateActionEventType22Code.PartialRedemptionWithoutPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PartialRedemptionWithPoolFactorReduction
 * CorporateActionEventType22Code.PartialRedemptionWithPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PayInKind
 * CorporateActionEventType22Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PlaceOfIncorporation
 * CorporateActionEventType22Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Prefunding
 * CorporateActionEventType22Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PriorityIssue
 * CorporateActionEventType22Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PutRedemption
 * CorporateActionEventType22Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Redenomination
 * CorporateActionEventType22Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#RemarketingAgreement
 * CorporateActionEventType22Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#RepurchaseOffer
 * CorporateActionEventType22Code.RepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#ReverseStockSplit
 * CorporateActionEventType22Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#RightsIssue
 * CorporateActionEventType22Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#ScripDividend
 * CorporateActionEventType22Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#SharesPremiumDividend
 * CorporateActionEventType22Code.SharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#SmallestNegotiableUnit
 * CorporateActionEventType22Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#SpinOff
 * CorporateActionEventType22Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#StockDividend
 * CorporateActionEventType22Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#StockSplit
 * CorporateActionEventType22Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#TaxReclaim
 * CorporateActionEventType22Code.TaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Tender
 * CorporateActionEventType22Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#TradingStatusDelisted
 * CorporateActionEventType22Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#TradingStatusSuspended
 * CorporateActionEventType22Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#WarrantExercise
 * CorporateActionEventType22Code.WarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#WithholdingTaxReliefCertification
 * CorporateActionEventType22Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Worthless
 * CorporateActionEventType22Code.Worthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Accumulation
 * CorporateActionEventType22Code.Accumulation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Information
 * CorporateActionEventType22Code.Information}</li>
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
 * "CorporateActionEventType22Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code
 * CorporateActionEventType26Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType22Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#ActiveTradingStatus
	 * CorporateActionEventType26Code.ActiveTradingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code ActiveTradingStatus = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.ActiveTradingStatus);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ActiveTradingStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Attachment
	 * CorporateActionEventType26Code.Attachment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Attachment = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Attachment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Attachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Bankruptcy
	 * CorporateActionEventType26Code.Bankruptcy}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Bankruptcy = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Bankruptcy);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#BondDefault
	 * CorporateActionEventType26Code.BondDefault}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code BondDefault = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.BondDefault);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BondDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#BonusIssue
	 * CorporateActionEventType26Code.BonusIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code BonusIssue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.BonusIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#CallOnIntermediateSecurities
	 * CorporateActionEventType26Code.CallOnIntermediateSecurities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CallOnIntermediateSecurities = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.CallOnIntermediateSecurities);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CallOnIntermediateSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#CapitalDistribution
	 * CorporateActionEventType26Code.CapitalDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CapitalDistribution = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.CapitalDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#CapitalGainsDistribution
	 * CorporateActionEventType26Code.CapitalGainsDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CapitalGainsDistribution = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.CapitalGainsDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalGainsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Capitalisation
	 * CorporateActionEventType26Code.Capitalisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Capitalisation = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Capitalisation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Capitalisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#CashDistributionFromNonEligibleSecuritiesSales
	 * CorporateActionEventType26Code.
	 * CashDistributionFromNonEligibleSecuritiesSales}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.CashDistributionFromNonEligibleSecuritiesSales);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDistributionFromNonEligibleSecuritiesSales.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#CashDividend
	 * CorporateActionEventType26Code.CashDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CashDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.CashDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Change
	 * CorporateActionEventType26Code.Change}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Change = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Change);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#CompanyOption
	 * CorporateActionEventType26Code.CompanyOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CompanyOption = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.CompanyOption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CompanyOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#ClassActionProposedSettlement
	 * CorporateActionEventType26Code.ClassActionProposedSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code ClassActionProposedSettlement = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.ClassActionProposedSettlement);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ClassActionProposedSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Consent
	 * CorporateActionEventType26Code.Consent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Consent = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Consent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Consent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Conversion
	 * CorporateActionEventType26Code.Conversion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Conversion = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Conversion);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Conversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#CreditEvent
	 * CorporateActionEventType26Code.CreditEvent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CreditEvent = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.CreditEvent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CreditEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#DecreaseInValue
	 * CorporateActionEventType26Code.DecreaseInValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code DecreaseInValue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.DecreaseInValue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Detachment
	 * CorporateActionEventType26Code.Detachment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Detachment = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Detachment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Detachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Disclosure
	 * CorporateActionEventType26Code.Disclosure}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Disclosure = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Disclosure);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Disclosure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#DividendOption
	 * CorporateActionEventType26Code.DividendOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code DividendOption = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.DividendOption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#DividendReinvestment
	 * CorporateActionEventType26Code.DividendReinvestment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code DividendReinvestment = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.DividendReinvestment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Drawing
	 * CorporateActionEventType26Code.Drawing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Drawing = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Drawing);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Drawing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#DutchAuction
	 * CorporateActionEventType26Code.DutchAuction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code DutchAuction = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.DutchAuction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DutchAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Exchange
	 * CorporateActionEventType26Code.Exchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Exchange = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Exchange);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Exchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#FinalMaturity
	 * CorporateActionEventType26Code.FinalMaturity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code FinalMaturity = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.FinalMaturity);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FinalMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#FullCall
	 * CorporateActionEventType26Code.FullCall}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code FullCall = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.FullCall);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FullCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#IncreaseInValue
	 * CorporateActionEventType26Code.IncreaseInValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code IncreaseInValue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.IncreaseInValue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IncreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#InstalmentCall
	 * CorporateActionEventType26Code.InstalmentCall}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code InstalmentCall = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.InstalmentCall);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InstalmentCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#InterestPayment
	 * CorporateActionEventType26Code.InterestPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code InterestPayment = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.InterestPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#InterestPaymentWithPrincipal
	 * CorporateActionEventType26Code.InterestPaymentWithPrincipal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code InterestPaymentWithPrincipal = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.InterestPaymentWithPrincipal);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPaymentWithPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#IntermediateSecuritiesDistribution
	 * CorporateActionEventType26Code.IntermediateSecuritiesDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code IntermediateSecuritiesDistribution = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.IntermediateSecuritiesDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IntermediateSecuritiesDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#LiquidationDividend
	 * CorporateActionEventType26Code.LiquidationDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code LiquidationDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.LiquidationDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.LiquidationDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#MaturityExtension
	 * CorporateActionEventType26Code.MaturityExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code MaturityExtension = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.MaturityExtension);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.MaturityExtension.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Merger
	 * CorporateActionEventType26Code.Merger}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Merger = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Merger);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#NonOfficialOffer
	 * CorporateActionEventType26Code.NonOfficialOffer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code NonOfficialOffer = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOfficialOffer";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.NonOfficialOffer);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonOfficialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#NonUSTEFRADCertification
	 * CorporateActionEventType26Code.NonUSTEFRADCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code NonUSTEFRADCertification = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.NonUSTEFRADCertification);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonUSTEFRADCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#OddLotSalePurchase
	 * CorporateActionEventType26Code.OddLotSalePurchase}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code OddLotSalePurchase = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.OddLotSalePurchase);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OddLotSalePurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#OtherEvent
	 * CorporateActionEventType26Code.OtherEvent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code OtherEvent = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.OtherEvent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OtherEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#PariPassu
	 * CorporateActionEventType26Code.PariPassu}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PariPassu = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.PariPassu);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PariPassu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#PartialRedemptionWithoutPoolFactorReduction
	 * CorporateActionEventType26Code.
	 * PartialRedemptionWithoutPoolFactorReduction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PartialRedemptionWithoutPoolFactorReduction = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutPoolFactorReduction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.PartialRedemptionWithoutPoolFactorReduction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithoutPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#PartialRedemptionWithPoolFactorReduction
	 * CorporateActionEventType26Code.PartialRedemptionWithPoolFactorReduction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PartialRedemptionWithPoolFactorReduction = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithPoolFactorReduction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.PartialRedemptionWithPoolFactorReduction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#PayInKind
	 * CorporateActionEventType26Code.PayInKind}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PayInKind = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.PayInKind);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PayInKind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#PlaceOfIncorporation
	 * CorporateActionEventType26Code.PlaceOfIncorporation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PlaceOfIncorporation = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.PlaceOfIncorporation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PlaceOfIncorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Prefunding
	 * CorporateActionEventType26Code.Prefunding}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Prefunding = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Prefunding);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Prefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#PriorityIssue
	 * CorporateActionEventType26Code.PriorityIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PriorityIssue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.PriorityIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PriorityIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#PutRedemption
	 * CorporateActionEventType26Code.PutRedemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PutRedemption = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.PutRedemption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Redenomination
	 * CorporateActionEventType26Code.Redenomination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Redenomination = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Redenomination);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#RemarketingAgreement
	 * CorporateActionEventType26Code.RemarketingAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code RemarketingAgreement = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.RemarketingAgreement);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RemarketingAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#RepurchaseOffer
	 * CorporateActionEventType26Code.RepurchaseOffer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code RepurchaseOffer = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.RepurchaseOffer);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RepurchaseOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#ReverseStockSplit
	 * CorporateActionEventType26Code.ReverseStockSplit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code ReverseStockSplit = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.ReverseStockSplit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#RightsIssue
	 * CorporateActionEventType26Code.RightsIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code RightsIssue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.RightsIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#ScripDividend
	 * CorporateActionEventType26Code.ScripDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code ScripDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.ScripDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ScripDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#SharesPremiumDividend
	 * CorporateActionEventType26Code.SharesPremiumDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code SharesPremiumDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.SharesPremiumDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SharesPremiumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#SmallestNegotiableUnit
	 * CorporateActionEventType26Code.SmallestNegotiableUnit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code SmallestNegotiableUnit = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.SmallestNegotiableUnit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SmallestNegotiableUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#SpinOff
	 * CorporateActionEventType26Code.SpinOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code SpinOff = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.SpinOff);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#StockDividend
	 * CorporateActionEventType26Code.StockDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code StockDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.StockDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#StockSplit
	 * CorporateActionEventType26Code.StockSplit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code StockSplit = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.StockSplit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#TaxReclaim
	 * CorporateActionEventType26Code.TaxReclaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code TaxReclaim = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.TaxReclaim);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TaxReclaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Tender
	 * CorporateActionEventType26Code.Tender}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Tender = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Tender);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#TradingStatusDelisted
	 * CorporateActionEventType26Code.TradingStatusDelisted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code TradingStatusDelisted = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.TradingStatusDelisted);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusDelisted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#TradingStatusSuspended
	 * CorporateActionEventType26Code.TradingStatusSuspended}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code TradingStatusSuspended = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.TradingStatusSuspended);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusSuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#WarrantExercise
	 * CorporateActionEventType26Code.WarrantExercise}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code WarrantExercise = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.WarrantExercise);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WarrantExercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#WithholdingTaxReliefCertification
	 * CorporateActionEventType26Code.WithholdingTaxReliefCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code WithholdingTaxReliefCertification = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.WithholdingTaxReliefCertification);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WithholdingTaxReliefCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Worthless
	 * CorporateActionEventType26Code.Worthless}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Worthless = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Worthless);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Worthless.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Accumulation
	 * CorporateActionEventType26Code.Accumulation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Accumulation = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Accumulation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Accumulation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType26Code#Information
	 * CorporateActionEventType26Code.Information}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Information = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.Information);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Information.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType22Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType22Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType22Code";
				definition = "Specifies the corporate action event type.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType26Code.mmObject());
				trace_lazy = () -> CorporateActionEventTypeV6Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType22Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventType22Code.Attachment,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Bankruptcy, com.tools20022.repository.codeset.CorporateActionEventType22Code.BondDefault,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventType22Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventType22Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Capitalisation, com.tools20022.repository.codeset.CorporateActionEventType22Code.CashDistributionFromNonEligibleSecuritiesSales,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventType22Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventType22Code.ClassActionProposedSettlement,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Consent, com.tools20022.repository.codeset.CorporateActionEventType22Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.CreditEvent, com.tools20022.repository.codeset.CorporateActionEventType22Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventType22Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.DividendOption, com.tools20022.repository.codeset.CorporateActionEventType22Code.DividendReinvestment,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventType22Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventType22Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.FullCall, com.tools20022.repository.codeset.CorporateActionEventType22Code.IncreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.InstalmentCall, com.tools20022.repository.codeset.CorporateActionEventType22Code.InterestPayment,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.InterestPaymentWithPrincipal, com.tools20022.repository.codeset.CorporateActionEventType22Code.IntermediateSecuritiesDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.LiquidationDividend, com.tools20022.repository.codeset.CorporateActionEventType22Code.MaturityExtension,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Merger, com.tools20022.repository.codeset.CorporateActionEventType22Code.NonOfficialOffer,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.NonUSTEFRADCertification, com.tools20022.repository.codeset.CorporateActionEventType22Code.OddLotSalePurchase,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventType22Code.PariPassu,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.PartialRedemptionWithoutPoolFactorReduction,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.PartialRedemptionWithPoolFactorReduction, com.tools20022.repository.codeset.CorporateActionEventType22Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventType22Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.PriorityIssue, com.tools20022.repository.codeset.CorporateActionEventType22Code.PutRedemption,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType22Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventType22Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.RightsIssue, com.tools20022.repository.codeset.CorporateActionEventType22Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventType22Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventType22Code.StockDividend,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventType22Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Tender, com.tools20022.repository.codeset.CorporateActionEventType22Code.TradingStatusDelisted,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.TradingStatusSuspended, com.tools20022.repository.codeset.CorporateActionEventType22Code.WarrantExercise,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.WithholdingTaxReliefCertification, com.tools20022.repository.codeset.CorporateActionEventType22Code.Worthless,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Accumulation, com.tools20022.repository.codeset.CorporateActionEventType22Code.Information);
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
		codesByName.put(Information.getCodeName().get(), Information);
	}

	public static CorporateActionEventType22Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType22Code[] values() {
		CorporateActionEventType22Code[] values = new CorporateActionEventType22Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType22Code> {
		@Override
		public CorporateActionEventType22Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType22Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}