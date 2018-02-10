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
import com.tools20022.repository.codeset.CorporateActionEventType21Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#ActiveTradingStatus
 * CorporateActionEventType21Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Attachment
 * CorporateActionEventType21Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Bankruptcy
 * CorporateActionEventType21Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#BondDefault
 * CorporateActionEventType21Code.BondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#BonusIssue
 * CorporateActionEventType21Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CallOnIntermediateSecurities
 * CorporateActionEventType21Code.CallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CapitalDistribution
 * CorporateActionEventType21Code.CapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CapitalGainsDistribution
 * CorporateActionEventType21Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Capitalisation
 * CorporateActionEventType21Code.Capitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventType21Code.CashDistributionFromNonEligibleSecuritiesSales
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CashDividend
 * CorporateActionEventType21Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Change
 * CorporateActionEventType21Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CompanyOption
 * CorporateActionEventType21Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#ClassActionProposedSettlement
 * CorporateActionEventType21Code.ClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Consent
 * CorporateActionEventType21Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Conversion
 * CorporateActionEventType21Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CreditEvent
 * CorporateActionEventType21Code.CreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#DecreaseInValue
 * CorporateActionEventType21Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Detachment
 * CorporateActionEventType21Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Disclosure
 * CorporateActionEventType21Code.Disclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#DividendOption
 * CorporateActionEventType21Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#DividendReinvestment
 * CorporateActionEventType21Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Drawing
 * CorporateActionEventType21Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#DutchAuction
 * CorporateActionEventType21Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Exchange
 * CorporateActionEventType21Code.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#FinalMaturity
 * CorporateActionEventType21Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#FullCall
 * CorporateActionEventType21Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#IncreaseInValue
 * CorporateActionEventType21Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#InstalmentCall
 * CorporateActionEventType21Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#InterestPayment
 * CorporateActionEventType21Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#InterestPaymentWithPrincipal
 * CorporateActionEventType21Code.InterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#IntermediateSecuritiesDistribution
 * CorporateActionEventType21Code.IntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#LiquidationDividend
 * CorporateActionEventType21Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#MaturityExtension
 * CorporateActionEventType21Code.MaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Merger
 * CorporateActionEventType21Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#NonOfficialOffer
 * CorporateActionEventType21Code.NonOfficialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#NonUSTEFRADCertification
 * CorporateActionEventType21Code.NonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#OddLotSalePurchase
 * CorporateActionEventType21Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#OtherEvent
 * CorporateActionEventType21Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PariPassu
 * CorporateActionEventType21Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PartialRedemptionWithoutPoolFactorReduction
 * CorporateActionEventType21Code.PartialRedemptionWithoutPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PartialRedemptionWithPoolFactorReduction
 * CorporateActionEventType21Code.PartialRedemptionWithPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PayInKind
 * CorporateActionEventType21Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PlaceOfIncorporation
 * CorporateActionEventType21Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Prefunding
 * CorporateActionEventType21Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PriorityIssue
 * CorporateActionEventType21Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PutRedemption
 * CorporateActionEventType21Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Redenomination
 * CorporateActionEventType21Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#RemarketingAgreement
 * CorporateActionEventType21Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#RepurchaseOffer
 * CorporateActionEventType21Code.RepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#ReverseStockSplit
 * CorporateActionEventType21Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#RightsIssue
 * CorporateActionEventType21Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#ScripDividend
 * CorporateActionEventType21Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#SharesPremiumDividend
 * CorporateActionEventType21Code.SharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#SmallestNegotiableUnit
 * CorporateActionEventType21Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#SpinOff
 * CorporateActionEventType21Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#StockDividend
 * CorporateActionEventType21Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#StockSplit
 * CorporateActionEventType21Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#TaxReclaim
 * CorporateActionEventType21Code.TaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Tender
 * CorporateActionEventType21Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#TradingStatusDelisted
 * CorporateActionEventType21Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#TradingStatusSuspended
 * CorporateActionEventType21Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#WarrantExercise
 * CorporateActionEventType21Code.WarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#WithholdingTaxReliefCertification
 * CorporateActionEventType21Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Worthless
 * CorporateActionEventType21Code.Worthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Accumulation
 * CorporateActionEventType21Code.Accumulation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#SecuritiesHoldersMeeting
 * CorporateActionEventType21Code.SecuritiesHoldersMeeting}</li>
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
 * "CorporateActionEventType21Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
 * CorporateActionEventType25Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType21Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#ActiveTradingStatus
	 * CorporateActionEventType25Code.ActiveTradingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code ActiveTradingStatus = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.ActiveTradingStatus);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ActiveTradingStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Attachment
	 * CorporateActionEventType25Code.Attachment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Attachment = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Attachment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Attachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Bankruptcy
	 * CorporateActionEventType25Code.Bankruptcy}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Bankruptcy = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Bankruptcy);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#BondDefault
	 * CorporateActionEventType25Code.BondDefault}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code BondDefault = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.BondDefault);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BondDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#BonusIssue
	 * CorporateActionEventType25Code.BonusIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code BonusIssue = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.BonusIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CallOnIntermediateSecurities
	 * CorporateActionEventType25Code.CallOnIntermediateSecurities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code CallOnIntermediateSecurities = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.CallOnIntermediateSecurities);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CallOnIntermediateSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CapitalDistribution
	 * CorporateActionEventType25Code.CapitalDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code CapitalDistribution = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.CapitalDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CapitalGainsDistribution
	 * CorporateActionEventType25Code.CapitalGainsDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code CapitalGainsDistribution = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.CapitalGainsDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalGainsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Capitalisation
	 * CorporateActionEventType25Code.Capitalisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Capitalisation = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Capitalisation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Capitalisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CashDistributionFromNonEligibleSecuritiesSales
	 * CorporateActionEventType25Code.
	 * CashDistributionFromNonEligibleSecuritiesSales}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.CashDistributionFromNonEligibleSecuritiesSales);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDistributionFromNonEligibleSecuritiesSales.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CashDividend
	 * CorporateActionEventType25Code.CashDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code CashDividend = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.CashDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Change
	 * CorporateActionEventType25Code.Change}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Change = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Change);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CompanyOption
	 * CorporateActionEventType25Code.CompanyOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code CompanyOption = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.CompanyOption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CompanyOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#ClassActionProposedSettlement
	 * CorporateActionEventType25Code.ClassActionProposedSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code ClassActionProposedSettlement = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.ClassActionProposedSettlement);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ClassActionProposedSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Consent
	 * CorporateActionEventType25Code.Consent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Consent = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Consent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Consent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Conversion
	 * CorporateActionEventType25Code.Conversion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Conversion = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Conversion);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Conversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CreditEvent
	 * CorporateActionEventType25Code.CreditEvent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code CreditEvent = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.CreditEvent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CreditEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#DecreaseInValue
	 * CorporateActionEventType25Code.DecreaseInValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code DecreaseInValue = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.DecreaseInValue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Detachment
	 * CorporateActionEventType25Code.Detachment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Detachment = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Detachment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Detachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Disclosure
	 * CorporateActionEventType25Code.Disclosure}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Disclosure = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Disclosure);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Disclosure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#DividendOption
	 * CorporateActionEventType25Code.DividendOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code DividendOption = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.DividendOption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#DividendReinvestment
	 * CorporateActionEventType25Code.DividendReinvestment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code DividendReinvestment = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.DividendReinvestment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Drawing
	 * CorporateActionEventType25Code.Drawing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Drawing = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Drawing);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Drawing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#DutchAuction
	 * CorporateActionEventType25Code.DutchAuction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code DutchAuction = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.DutchAuction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DutchAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Exchange
	 * CorporateActionEventType25Code.Exchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Exchange = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Exchange);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Exchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#FinalMaturity
	 * CorporateActionEventType25Code.FinalMaturity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code FinalMaturity = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.FinalMaturity);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FinalMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#FullCall
	 * CorporateActionEventType25Code.FullCall}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code FullCall = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.FullCall);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FullCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#IncreaseInValue
	 * CorporateActionEventType25Code.IncreaseInValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code IncreaseInValue = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.IncreaseInValue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IncreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#InstalmentCall
	 * CorporateActionEventType25Code.InstalmentCall}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code InstalmentCall = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.InstalmentCall);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InstalmentCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#InterestPayment
	 * CorporateActionEventType25Code.InterestPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code InterestPayment = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.InterestPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#InterestPaymentWithPrincipal
	 * CorporateActionEventType25Code.InterestPaymentWithPrincipal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code InterestPaymentWithPrincipal = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.InterestPaymentWithPrincipal);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPaymentWithPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#IntermediateSecuritiesDistribution
	 * CorporateActionEventType25Code.IntermediateSecuritiesDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code IntermediateSecuritiesDistribution = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.IntermediateSecuritiesDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IntermediateSecuritiesDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#LiquidationDividend
	 * CorporateActionEventType25Code.LiquidationDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code LiquidationDividend = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.LiquidationDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.LiquidationDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#MaturityExtension
	 * CorporateActionEventType25Code.MaturityExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code MaturityExtension = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.MaturityExtension);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.MaturityExtension.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Merger
	 * CorporateActionEventType25Code.Merger}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Merger = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Merger);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#NonOfficialOffer
	 * CorporateActionEventType25Code.NonOfficialOffer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code NonOfficialOffer = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOfficialOffer";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.NonOfficialOffer);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonOfficialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#NonUSTEFRADCertification
	 * CorporateActionEventType25Code.NonUSTEFRADCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code NonUSTEFRADCertification = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.NonUSTEFRADCertification);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonUSTEFRADCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#OddLotSalePurchase
	 * CorporateActionEventType25Code.OddLotSalePurchase}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code OddLotSalePurchase = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.OddLotSalePurchase);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OddLotSalePurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#OtherEvent
	 * CorporateActionEventType25Code.OtherEvent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code OtherEvent = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.OtherEvent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OtherEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PariPassu
	 * CorporateActionEventType25Code.PariPassu}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code PariPassu = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.PariPassu);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PariPassu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PartialRedemptionWithoutPoolFactorReduction
	 * CorporateActionEventType25Code.
	 * PartialRedemptionWithoutPoolFactorReduction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code PartialRedemptionWithoutPoolFactorReduction = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutPoolFactorReduction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.PartialRedemptionWithoutPoolFactorReduction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithoutPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PartialRedemptionWithPoolFactorReduction
	 * CorporateActionEventType25Code.PartialRedemptionWithPoolFactorReduction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code PartialRedemptionWithPoolFactorReduction = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithPoolFactorReduction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.PartialRedemptionWithPoolFactorReduction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PayInKind
	 * CorporateActionEventType25Code.PayInKind}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code PayInKind = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.PayInKind);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PayInKind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PlaceOfIncorporation
	 * CorporateActionEventType25Code.PlaceOfIncorporation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code PlaceOfIncorporation = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.PlaceOfIncorporation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PlaceOfIncorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Prefunding
	 * CorporateActionEventType25Code.Prefunding}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Prefunding = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Prefunding);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Prefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PriorityIssue
	 * CorporateActionEventType25Code.PriorityIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code PriorityIssue = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.PriorityIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PriorityIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PutRedemption
	 * CorporateActionEventType25Code.PutRedemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code PutRedemption = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.PutRedemption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Redenomination
	 * CorporateActionEventType25Code.Redenomination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Redenomination = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Redenomination);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#RemarketingAgreement
	 * CorporateActionEventType25Code.RemarketingAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code RemarketingAgreement = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.RemarketingAgreement);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RemarketingAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#RepurchaseOffer
	 * CorporateActionEventType25Code.RepurchaseOffer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code RepurchaseOffer = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.RepurchaseOffer);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RepurchaseOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#ReverseStockSplit
	 * CorporateActionEventType25Code.ReverseStockSplit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code ReverseStockSplit = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.ReverseStockSplit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#RightsIssue
	 * CorporateActionEventType25Code.RightsIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code RightsIssue = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.RightsIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#ScripDividend
	 * CorporateActionEventType25Code.ScripDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code ScripDividend = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.ScripDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ScripDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#SharesPremiumDividend
	 * CorporateActionEventType25Code.SharesPremiumDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code SharesPremiumDividend = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.SharesPremiumDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SharesPremiumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#SmallestNegotiableUnit
	 * CorporateActionEventType25Code.SmallestNegotiableUnit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code SmallestNegotiableUnit = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.SmallestNegotiableUnit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SmallestNegotiableUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#SpinOff
	 * CorporateActionEventType25Code.SpinOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code SpinOff = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.SpinOff);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#StockDividend
	 * CorporateActionEventType25Code.StockDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code StockDividend = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.StockDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#StockSplit
	 * CorporateActionEventType25Code.StockSplit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code StockSplit = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.StockSplit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#TaxReclaim
	 * CorporateActionEventType25Code.TaxReclaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code TaxReclaim = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.TaxReclaim);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TaxReclaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Tender
	 * CorporateActionEventType25Code.Tender}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Tender = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Tender);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#TradingStatusDelisted
	 * CorporateActionEventType25Code.TradingStatusDelisted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code TradingStatusDelisted = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.TradingStatusDelisted);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusDelisted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#TradingStatusSuspended
	 * CorporateActionEventType25Code.TradingStatusSuspended}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code TradingStatusSuspended = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.TradingStatusSuspended);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusSuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#WarrantExercise
	 * CorporateActionEventType25Code.WarrantExercise}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code WarrantExercise = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.WarrantExercise);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WarrantExercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#WithholdingTaxReliefCertification
	 * CorporateActionEventType25Code.WithholdingTaxReliefCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code WithholdingTaxReliefCertification = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.WithholdingTaxReliefCertification);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WithholdingTaxReliefCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Worthless
	 * CorporateActionEventType25Code.Worthless}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Worthless = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Worthless);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Worthless.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Accumulation
	 * CorporateActionEventType25Code.Accumulation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code Accumulation = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.Accumulation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Accumulation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
	 * CorporateActionEventType21Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#SecuritiesHoldersMeeting
	 * CorporateActionEventType25Code.SecuritiesHoldersMeeting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType21Code SecuritiesHoldersMeeting = new CorporateActionEventType21Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHoldersMeeting";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.SecuritiesHoldersMeeting);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType21Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SecuritiesHoldersMeeting.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType21Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType21Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType21Code";
				definition = "Specifies the corporate action event type.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType25Code.mmObject());
				trace_lazy = () -> CorporateActionEventTypeV6Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType21Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventType21Code.Attachment,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Bankruptcy, com.tools20022.repository.codeset.CorporateActionEventType21Code.BondDefault,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventType21Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventType21Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Capitalisation, com.tools20022.repository.codeset.CorporateActionEventType21Code.CashDistributionFromNonEligibleSecuritiesSales,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventType21Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventType21Code.ClassActionProposedSettlement,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Consent, com.tools20022.repository.codeset.CorporateActionEventType21Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.CreditEvent, com.tools20022.repository.codeset.CorporateActionEventType21Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventType21Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.DividendOption, com.tools20022.repository.codeset.CorporateActionEventType21Code.DividendReinvestment,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventType21Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventType21Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.FullCall, com.tools20022.repository.codeset.CorporateActionEventType21Code.IncreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.InstalmentCall, com.tools20022.repository.codeset.CorporateActionEventType21Code.InterestPayment,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.InterestPaymentWithPrincipal, com.tools20022.repository.codeset.CorporateActionEventType21Code.IntermediateSecuritiesDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.LiquidationDividend, com.tools20022.repository.codeset.CorporateActionEventType21Code.MaturityExtension,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Merger, com.tools20022.repository.codeset.CorporateActionEventType21Code.NonOfficialOffer,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.NonUSTEFRADCertification, com.tools20022.repository.codeset.CorporateActionEventType21Code.OddLotSalePurchase,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventType21Code.PariPassu,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.PartialRedemptionWithoutPoolFactorReduction,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.PartialRedemptionWithPoolFactorReduction, com.tools20022.repository.codeset.CorporateActionEventType21Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventType21Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.PriorityIssue, com.tools20022.repository.codeset.CorporateActionEventType21Code.PutRedemption,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType21Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventType21Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.RightsIssue, com.tools20022.repository.codeset.CorporateActionEventType21Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventType21Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventType21Code.StockDividend,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventType21Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Tender, com.tools20022.repository.codeset.CorporateActionEventType21Code.TradingStatusDelisted,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.TradingStatusSuspended, com.tools20022.repository.codeset.CorporateActionEventType21Code.WarrantExercise,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.WithholdingTaxReliefCertification, com.tools20022.repository.codeset.CorporateActionEventType21Code.Worthless,
						com.tools20022.repository.codeset.CorporateActionEventType21Code.Accumulation, com.tools20022.repository.codeset.CorporateActionEventType21Code.SecuritiesHoldersMeeting);
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
	}

	public static CorporateActionEventType21Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType21Code[] values() {
		CorporateActionEventType21Code[] values = new CorporateActionEventType21Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType21Code> {
		@Override
		public CorporateActionEventType21Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType21Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}