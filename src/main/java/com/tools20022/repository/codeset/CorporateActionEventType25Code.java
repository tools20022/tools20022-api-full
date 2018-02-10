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
import com.tools20022.repository.codeset.CorporateActionEventType25Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#ActiveTradingStatus
 * CorporateActionEventType25Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Attachment
 * CorporateActionEventType25Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Bankruptcy
 * CorporateActionEventType25Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#BondDefault
 * CorporateActionEventType25Code.BondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#BonusIssue
 * CorporateActionEventType25Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CallOnIntermediateSecurities
 * CorporateActionEventType25Code.CallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CapitalDistribution
 * CorporateActionEventType25Code.CapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CapitalGainsDistribution
 * CorporateActionEventType25Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Capitalisation
 * CorporateActionEventType25Code.Capitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventType25Code.CashDistributionFromNonEligibleSecuritiesSales
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CashDividend
 * CorporateActionEventType25Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Change
 * CorporateActionEventType25Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CompanyOption
 * CorporateActionEventType25Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#ClassActionProposedSettlement
 * CorporateActionEventType25Code.ClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Consent
 * CorporateActionEventType25Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Conversion
 * CorporateActionEventType25Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#CreditEvent
 * CorporateActionEventType25Code.CreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#DecreaseInValue
 * CorporateActionEventType25Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Detachment
 * CorporateActionEventType25Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Disclosure
 * CorporateActionEventType25Code.Disclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#DividendOption
 * CorporateActionEventType25Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#DividendReinvestment
 * CorporateActionEventType25Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Drawing
 * CorporateActionEventType25Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#DutchAuction
 * CorporateActionEventType25Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Exchange
 * CorporateActionEventType25Code.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#FinalMaturity
 * CorporateActionEventType25Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#FullCall
 * CorporateActionEventType25Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#IncreaseInValue
 * CorporateActionEventType25Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#InstalmentCall
 * CorporateActionEventType25Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#InterestPayment
 * CorporateActionEventType25Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#InterestPaymentWithPrincipal
 * CorporateActionEventType25Code.InterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#IntermediateSecuritiesDistribution
 * CorporateActionEventType25Code.IntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#LiquidationDividend
 * CorporateActionEventType25Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#MaturityExtension
 * CorporateActionEventType25Code.MaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Merger
 * CorporateActionEventType25Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#NonOfficialOffer
 * CorporateActionEventType25Code.NonOfficialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#NonUSTEFRADCertification
 * CorporateActionEventType25Code.NonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#OddLotSalePurchase
 * CorporateActionEventType25Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#OtherEvent
 * CorporateActionEventType25Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PariPassu
 * CorporateActionEventType25Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PartialRedemptionWithoutPoolFactorReduction
 * CorporateActionEventType25Code.PartialRedemptionWithoutPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PartialRedemptionWithPoolFactorReduction
 * CorporateActionEventType25Code.PartialRedemptionWithPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PayInKind
 * CorporateActionEventType25Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PlaceOfIncorporation
 * CorporateActionEventType25Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Prefunding
 * CorporateActionEventType25Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PriorityIssue
 * CorporateActionEventType25Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#PutRedemption
 * CorporateActionEventType25Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Redenomination
 * CorporateActionEventType25Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#RemarketingAgreement
 * CorporateActionEventType25Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#RepurchaseOffer
 * CorporateActionEventType25Code.RepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#ReverseStockSplit
 * CorporateActionEventType25Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#RightsIssue
 * CorporateActionEventType25Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#ScripDividend
 * CorporateActionEventType25Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#SharesPremiumDividend
 * CorporateActionEventType25Code.SharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#SmallestNegotiableUnit
 * CorporateActionEventType25Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#SpinOff
 * CorporateActionEventType25Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#StockDividend
 * CorporateActionEventType25Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#StockSplit
 * CorporateActionEventType25Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#TaxReclaim
 * CorporateActionEventType25Code.TaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Tender
 * CorporateActionEventType25Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#TradingStatusDelisted
 * CorporateActionEventType25Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#TradingStatusSuspended
 * CorporateActionEventType25Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#WarrantExercise
 * CorporateActionEventType25Code.WarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#WithholdingTaxReliefCertification
 * CorporateActionEventType25Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Worthless
 * CorporateActionEventType25Code.Worthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#Accumulation
 * CorporateActionEventType25Code.Accumulation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#SecuritiesHoldersMeeting
 * CorporateActionEventType25Code.SecuritiesHoldersMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code#TaxOnNonDistributedProceeds
 * CorporateActionEventType25Code.TaxOnNonDistributedProceeds}</li>
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
 * "CorporateActionEventType25Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
 * CorporateActionEventType21Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType25Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#ActiveTradingStatus
	 * CorporateActionEventType21Code.ActiveTradingStatus}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code ActiveTradingStatus = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			previousVersion_lazy = () -> CorporateActionEventType21Code.ActiveTradingStatus;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ActiveTradingStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Attachment
	 * CorporateActionEventType21Code.Attachment}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Attachment = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Attachment;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Attachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Bankruptcy
	 * CorporateActionEventType21Code.Bankruptcy}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Bankruptcy = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Bankruptcy;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#BondDefault
	 * CorporateActionEventType21Code.BondDefault}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code BondDefault = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			previousVersion_lazy = () -> CorporateActionEventType21Code.BondDefault;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BondDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#BonusIssue
	 * CorporateActionEventType21Code.BonusIssue}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code BonusIssue = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			previousVersion_lazy = () -> CorporateActionEventType21Code.BonusIssue;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnIntermediateSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CallOnIntermediateSecurities
	 * CorporateActionEventType21Code.CallOnIntermediateSecurities}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code CallOnIntermediateSecurities = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			previousVersion_lazy = () -> CorporateActionEventType21Code.CallOnIntermediateSecurities;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CallOnIntermediateSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CapitalDistribution
	 * CorporateActionEventType21Code.CapitalDistribution}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code CapitalDistribution = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			previousVersion_lazy = () -> CorporateActionEventType21Code.CapitalDistribution;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CapitalGainsDistribution
	 * CorporateActionEventType21Code.CapitalGainsDistribution}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code CapitalGainsDistribution = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			previousVersion_lazy = () -> CorporateActionEventType21Code.CapitalGainsDistribution;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalGainsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capitalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Capitalisation
	 * CorporateActionEventType21Code.Capitalisation}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Capitalisation = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Capitalisation;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Capitalisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionFromNonEligibleSecuritiesSales"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CashDistributionFromNonEligibleSecuritiesSales
	 * CorporateActionEventType21Code.
	 * CashDistributionFromNonEligibleSecuritiesSales}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			previousVersion_lazy = () -> CorporateActionEventType21Code.CashDistributionFromNonEligibleSecuritiesSales;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDistributionFromNonEligibleSecuritiesSales.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CashDividend
	 * CorporateActionEventType21Code.CashDividend}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code CashDividend = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			previousVersion_lazy = () -> CorporateActionEventType21Code.CashDividend;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Change
	 * CorporateActionEventType21Code.Change}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Change = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Change;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CompanyOption
	 * CorporateActionEventType21Code.CompanyOption}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code CompanyOption = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			previousVersion_lazy = () -> CorporateActionEventType21Code.CompanyOption;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CompanyOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionProposedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#ClassActionProposedSettlement
	 * CorporateActionEventType21Code.ClassActionProposedSettlement}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code ClassActionProposedSettlement = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			previousVersion_lazy = () -> CorporateActionEventType21Code.ClassActionProposedSettlement;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ClassActionProposedSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Consent
	 * CorporateActionEventType21Code.Consent}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Consent = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Consent;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Consent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Conversion
	 * CorporateActionEventType21Code.Conversion}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Conversion = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Conversion;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Conversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#CreditEvent
	 * CorporateActionEventType21Code.CreditEvent}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code CreditEvent = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			previousVersion_lazy = () -> CorporateActionEventType21Code.CreditEvent;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CreditEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#DecreaseInValue
	 * CorporateActionEventType21Code.DecreaseInValue}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code DecreaseInValue = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			previousVersion_lazy = () -> CorporateActionEventType21Code.DecreaseInValue;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Detachment
	 * CorporateActionEventType21Code.Detachment}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Detachment = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Detachment;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Detachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Disclosure
	 * CorporateActionEventType21Code.Disclosure}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Disclosure = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Disclosure;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Disclosure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#DividendOption
	 * CorporateActionEventType21Code.DividendOption}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code DividendOption = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			previousVersion_lazy = () -> CorporateActionEventType21Code.DividendOption;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#DividendReinvestment
	 * CorporateActionEventType21Code.DividendReinvestment}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code DividendReinvestment = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			previousVersion_lazy = () -> CorporateActionEventType21Code.DividendReinvestment;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Drawing
	 * CorporateActionEventType21Code.Drawing}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Drawing = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Drawing;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Drawing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#DutchAuction
	 * CorporateActionEventType21Code.DutchAuction}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code DutchAuction = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			previousVersion_lazy = () -> CorporateActionEventType21Code.DutchAuction;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DutchAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Exchange
	 * CorporateActionEventType21Code.Exchange}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Exchange = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Exchange;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Exchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#FinalMaturity
	 * CorporateActionEventType21Code.FinalMaturity}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code FinalMaturity = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			previousVersion_lazy = () -> CorporateActionEventType21Code.FinalMaturity;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FinalMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#FullCall
	 * CorporateActionEventType21Code.FullCall}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code FullCall = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			previousVersion_lazy = () -> CorporateActionEventType21Code.FullCall;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FullCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#IncreaseInValue
	 * CorporateActionEventType21Code.IncreaseInValue}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code IncreaseInValue = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			previousVersion_lazy = () -> CorporateActionEventType21Code.IncreaseInValue;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IncreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#InstalmentCall
	 * CorporateActionEventType21Code.InstalmentCall}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code InstalmentCall = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			previousVersion_lazy = () -> CorporateActionEventType21Code.InstalmentCall;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InstalmentCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#InterestPayment
	 * CorporateActionEventType21Code.InterestPayment}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code InterestPayment = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			previousVersion_lazy = () -> CorporateActionEventType21Code.InterestPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentWithPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#InterestPaymentWithPrincipal
	 * CorporateActionEventType21Code.InterestPaymentWithPrincipal}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code InterestPaymentWithPrincipal = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			previousVersion_lazy = () -> CorporateActionEventType21Code.InterestPaymentWithPrincipal;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPaymentWithPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#IntermediateSecuritiesDistribution
	 * CorporateActionEventType21Code.IntermediateSecuritiesDistribution}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code IntermediateSecuritiesDistribution = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			previousVersion_lazy = () -> CorporateActionEventType21Code.IntermediateSecuritiesDistribution;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IntermediateSecuritiesDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#LiquidationDividend
	 * CorporateActionEventType21Code.LiquidationDividend}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code LiquidationDividend = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			previousVersion_lazy = () -> CorporateActionEventType21Code.LiquidationDividend;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.LiquidationDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#MaturityExtension
	 * CorporateActionEventType21Code.MaturityExtension}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code MaturityExtension = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			previousVersion_lazy = () -> CorporateActionEventType21Code.MaturityExtension;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.MaturityExtension.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Merger
	 * CorporateActionEventType21Code.Merger}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Merger = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Merger;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonOfficialOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#NonOfficialOffer
	 * CorporateActionEventType21Code.NonOfficialOffer}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code NonOfficialOffer = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOfficialOffer";
			previousVersion_lazy = () -> CorporateActionEventType21Code.NonOfficialOffer;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonOfficialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUSTEFRADCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#NonUSTEFRADCertification
	 * CorporateActionEventType21Code.NonUSTEFRADCertification}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code NonUSTEFRADCertification = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			previousVersion_lazy = () -> CorporateActionEventType21Code.NonUSTEFRADCertification;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonUSTEFRADCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#OddLotSalePurchase
	 * CorporateActionEventType21Code.OddLotSalePurchase}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code OddLotSalePurchase = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			previousVersion_lazy = () -> CorporateActionEventType21Code.OddLotSalePurchase;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OddLotSalePurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#OtherEvent
	 * CorporateActionEventType21Code.OtherEvent}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code OtherEvent = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			previousVersion_lazy = () -> CorporateActionEventType21Code.OtherEvent;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OtherEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PariPassu
	 * CorporateActionEventType21Code.PariPassu}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code PariPassu = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			previousVersion_lazy = () -> CorporateActionEventType21Code.PariPassu;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PariPassu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutPoolFactorReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PartialRedemptionWithoutPoolFactorReduction
	 * CorporateActionEventType21Code.
	 * PartialRedemptionWithoutPoolFactorReduction}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code PartialRedemptionWithoutPoolFactorReduction = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutPoolFactorReduction";
			previousVersion_lazy = () -> CorporateActionEventType21Code.PartialRedemptionWithoutPoolFactorReduction;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithoutPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithPoolFactorReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PartialRedemptionWithPoolFactorReduction
	 * CorporateActionEventType21Code.PartialRedemptionWithPoolFactorReduction}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code PartialRedemptionWithPoolFactorReduction = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithPoolFactorReduction";
			previousVersion_lazy = () -> CorporateActionEventType21Code.PartialRedemptionWithPoolFactorReduction;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PayInKind
	 * CorporateActionEventType21Code.PayInKind}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code PayInKind = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			previousVersion_lazy = () -> CorporateActionEventType21Code.PayInKind;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PayInKind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PlaceOfIncorporation
	 * CorporateActionEventType21Code.PlaceOfIncorporation}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code PlaceOfIncorporation = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			previousVersion_lazy = () -> CorporateActionEventType21Code.PlaceOfIncorporation;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PlaceOfIncorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Prefunding
	 * CorporateActionEventType21Code.Prefunding}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Prefunding = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Prefunding;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Prefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PriorityIssue
	 * CorporateActionEventType21Code.PriorityIssue}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code PriorityIssue = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			previousVersion_lazy = () -> CorporateActionEventType21Code.PriorityIssue;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PriorityIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#PutRedemption
	 * CorporateActionEventType21Code.PutRedemption}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code PutRedemption = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			previousVersion_lazy = () -> CorporateActionEventType21Code.PutRedemption;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Redenomination
	 * CorporateActionEventType21Code.Redenomination}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Redenomination = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Redenomination;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#RemarketingAgreement
	 * CorporateActionEventType21Code.RemarketingAgreement}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code RemarketingAgreement = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			previousVersion_lazy = () -> CorporateActionEventType21Code.RemarketingAgreement;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RemarketingAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#RepurchaseOffer
	 * CorporateActionEventType21Code.RepurchaseOffer}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code RepurchaseOffer = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			previousVersion_lazy = () -> CorporateActionEventType21Code.RepurchaseOffer;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RepurchaseOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#ReverseStockSplit
	 * CorporateActionEventType21Code.ReverseStockSplit}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code ReverseStockSplit = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			previousVersion_lazy = () -> CorporateActionEventType21Code.ReverseStockSplit;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#RightsIssue
	 * CorporateActionEventType21Code.RightsIssue}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code RightsIssue = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			previousVersion_lazy = () -> CorporateActionEventType21Code.RightsIssue;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#ScripDividend
	 * CorporateActionEventType21Code.ScripDividend}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code ScripDividend = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			previousVersion_lazy = () -> CorporateActionEventType21Code.ScripDividend;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ScripDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesPremiumDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#SharesPremiumDividend
	 * CorporateActionEventType21Code.SharesPremiumDividend}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code SharesPremiumDividend = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			previousVersion_lazy = () -> CorporateActionEventType21Code.SharesPremiumDividend;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SharesPremiumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#SmallestNegotiableUnit
	 * CorporateActionEventType21Code.SmallestNegotiableUnit}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code SmallestNegotiableUnit = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			previousVersion_lazy = () -> CorporateActionEventType21Code.SmallestNegotiableUnit;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SmallestNegotiableUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#SpinOff
	 * CorporateActionEventType21Code.SpinOff}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code SpinOff = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			previousVersion_lazy = () -> CorporateActionEventType21Code.SpinOff;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#StockDividend
	 * CorporateActionEventType21Code.StockDividend}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code StockDividend = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			previousVersion_lazy = () -> CorporateActionEventType21Code.StockDividend;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#StockSplit
	 * CorporateActionEventType21Code.StockSplit}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code StockSplit = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			previousVersion_lazy = () -> CorporateActionEventType21Code.StockSplit;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#TaxReclaim
	 * CorporateActionEventType21Code.TaxReclaim}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code TaxReclaim = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			previousVersion_lazy = () -> CorporateActionEventType21Code.TaxReclaim;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TaxReclaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Tender
	 * CorporateActionEventType21Code.Tender}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Tender = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Tender;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#TradingStatusDelisted
	 * CorporateActionEventType21Code.TradingStatusDelisted}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code TradingStatusDelisted = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			previousVersion_lazy = () -> CorporateActionEventType21Code.TradingStatusDelisted;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusDelisted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#TradingStatusSuspended
	 * CorporateActionEventType21Code.TradingStatusSuspended}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code TradingStatusSuspended = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			previousVersion_lazy = () -> CorporateActionEventType21Code.TradingStatusSuspended;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusSuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantExercise"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#WarrantExercise
	 * CorporateActionEventType21Code.WarrantExercise}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code WarrantExercise = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			previousVersion_lazy = () -> CorporateActionEventType21Code.WarrantExercise;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WarrantExercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#WithholdingTaxReliefCertification
	 * CorporateActionEventType21Code.WithholdingTaxReliefCertification}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code WithholdingTaxReliefCertification = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			previousVersion_lazy = () -> CorporateActionEventType21Code.WithholdingTaxReliefCertification;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WithholdingTaxReliefCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Worthless
	 * CorporateActionEventType21Code.Worthless}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Worthless = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Worthless;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Worthless.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#Accumulation
	 * CorporateActionEventType21Code.Accumulation}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code Accumulation = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			previousVersion_lazy = () -> CorporateActionEventType21Code.Accumulation;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Accumulation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHoldersMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code#SecuritiesHoldersMeeting
	 * CorporateActionEventType21Code.SecuritiesHoldersMeeting}</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code SecuritiesHoldersMeeting = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHoldersMeeting";
			previousVersion_lazy = () -> CorporateActionEventType21Code.SecuritiesHoldersMeeting;
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SecuritiesHoldersMeeting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType25Code
	 * CorporateActionEventType25Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnNonDistributedProceeds"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType25Code TaxOnNonDistributedProceeds = new CorporateActionEventType25Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnNonDistributedProceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType25Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TaxOnNonDistributedProceeds.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType25Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType25Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType25Code";
				definition = "Specifies the corporate action event type.";
				previousVersion_lazy = () -> CorporateActionEventType21Code.mmObject();
				trace_lazy = () -> CorporateActionEventTypeV6Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType25Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventType25Code.Attachment,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Bankruptcy, com.tools20022.repository.codeset.CorporateActionEventType25Code.BondDefault,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventType25Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventType25Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Capitalisation, com.tools20022.repository.codeset.CorporateActionEventType25Code.CashDistributionFromNonEligibleSecuritiesSales,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventType25Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventType25Code.ClassActionProposedSettlement,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Consent, com.tools20022.repository.codeset.CorporateActionEventType25Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.CreditEvent, com.tools20022.repository.codeset.CorporateActionEventType25Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventType25Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.DividendOption, com.tools20022.repository.codeset.CorporateActionEventType25Code.DividendReinvestment,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventType25Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventType25Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.FullCall, com.tools20022.repository.codeset.CorporateActionEventType25Code.IncreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.InstalmentCall, com.tools20022.repository.codeset.CorporateActionEventType25Code.InterestPayment,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.InterestPaymentWithPrincipal, com.tools20022.repository.codeset.CorporateActionEventType25Code.IntermediateSecuritiesDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.LiquidationDividend, com.tools20022.repository.codeset.CorporateActionEventType25Code.MaturityExtension,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Merger, com.tools20022.repository.codeset.CorporateActionEventType25Code.NonOfficialOffer,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.NonUSTEFRADCertification, com.tools20022.repository.codeset.CorporateActionEventType25Code.OddLotSalePurchase,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventType25Code.PariPassu,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.PartialRedemptionWithoutPoolFactorReduction,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.PartialRedemptionWithPoolFactorReduction, com.tools20022.repository.codeset.CorporateActionEventType25Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventType25Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.PriorityIssue, com.tools20022.repository.codeset.CorporateActionEventType25Code.PutRedemption,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType25Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventType25Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.RightsIssue, com.tools20022.repository.codeset.CorporateActionEventType25Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventType25Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventType25Code.StockDividend,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventType25Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Tender, com.tools20022.repository.codeset.CorporateActionEventType25Code.TradingStatusDelisted,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.TradingStatusSuspended, com.tools20022.repository.codeset.CorporateActionEventType25Code.WarrantExercise,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.WithholdingTaxReliefCertification, com.tools20022.repository.codeset.CorporateActionEventType25Code.Worthless,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.Accumulation, com.tools20022.repository.codeset.CorporateActionEventType25Code.SecuritiesHoldersMeeting,
						com.tools20022.repository.codeset.CorporateActionEventType25Code.TaxOnNonDistributedProceeds);
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
		codesByName.put(TaxOnNonDistributedProceeds.getCodeName().get(), TaxOnNonDistributedProceeds);
	}

	public static CorporateActionEventType25Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType25Code[] values() {
		CorporateActionEventType25Code[] values = new CorporateActionEventType25Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType25Code> {
		@Override
		public CorporateActionEventType25Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType25Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}