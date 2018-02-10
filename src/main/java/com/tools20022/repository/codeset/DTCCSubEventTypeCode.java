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
import com.tools20022.repository.codeset.DTCCSubEventTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub
 * event types.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#OptOut
 * DTCCSubEventTypeCode.OptOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#DividendReinvestmentByDTC
 * DTCCSubEventTypeCode.DividendReinvestmentByDTC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#PlaceOfListing
 * DTCCSubEventTypeCode.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#BoardLot
 * DTCCSubEventTypeCode.BoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#InterimPayment
 * DTCCSubEventTypeCode.InterimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#FinalPayment
 * DTCCSubEventTypeCode.FinalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Remarketing
 * DTCCSubEventTypeCode.Remarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Unwind
 * DTCCSubEventTypeCode.Unwind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#AnnualGeneral
 * DTCCSubEventTypeCode.AnnualGeneral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Extraordinary
 * DTCCSubEventTypeCode.Extraordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Ordinary
 * DTCCSubEventTypeCode.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Special
 * DTCCSubEventTypeCode.Special}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#ShareExchange
 * DTCCSubEventTypeCode.ShareExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Standard
 * DTCCSubEventTypeCode.Standard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Transfer
 * DTCCSubEventTypeCode.Transfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#SurvivorOptions
 * DTCCSubEventTypeCode.SurvivorOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#MortgageBacked
 * DTCCSubEventTypeCode.MortgageBacked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#SaleOfAssets
 * DTCCSubEventTypeCode.SaleOfAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#PhysicalRightsNotIssued
 * DTCCSubEventTypeCode.PhysicalRightsNotIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#PoisonPill
 * DTCCSubEventTypeCode.PoisonPill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#DividendReinvestmentByIssuer
 * DTCCSubEventTypeCode.DividendReinvestmentByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#MandatoryRedemptionOfShares
 * DTCCSubEventTypeCode.MandatoryRedemptionOfShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#SharePurchasePlan
 * DTCCSubEventTypeCode.SharePurchasePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#OpenOffer
 * DTCCSubEventTypeCode.OpenOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#TenderWithRights
 * DTCCSubEventTypeCode.TenderWithRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#CashinLieu
 * DTCCSubEventTypeCode.CashinLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#BidTenderSealedTender
 * DTCCSubEventTypeCode.BidTenderSealedTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#OfferToPurchase
 * DTCCSubEventTypeCode.OfferToPurchase}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#ADR
 * DTCCSubEventTypeCode.ADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#WithPayout
 * DTCCSubEventTypeCode.WithPayout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#WithoutPayout
 * DTCCSubEventTypeCode.WithoutPayout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#TaxCredit
 * DTCCSubEventTypeCode.TaxCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#USLegal144A
 * DTCCSubEventTypeCode.USLegal144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#CashAndSecurities
 * DTCCSubEventTypeCode.CashAndSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#RegulationS
 * DTCCSubEventTypeCode.RegulationS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#ImportantNotice
 * DTCCSubEventTypeCode.ImportantNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#BasedOnRecordDateHoldings
 * DTCCSubEventTypeCode.BasedOnRecordDateHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#PresentationRequired
 * DTCCSubEventTypeCode.PresentationRequired}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Cash
 * DTCCSubEventTypeCode.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Securities
 * DTCCSubEventTypeCode.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#ConvertAndTender
 * DTCCSubEventTypeCode.ConvertAndTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#MiniTender
 * DTCCSubEventTypeCode.MiniTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#SelfTender
 * DTCCSubEventTypeCode.SelfTender}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#GDR
 * DTCCSubEventTypeCode.GDR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#DeemedDividend305C
 * DTCCSubEventTypeCode.DeemedDividend305C}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#DividendEquivalentPayment871M
 * DTCCSubEventTypeCode.DividendEquivalentPayment871M}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode#Conversion
 * DTCCSubEventTypeCode.Conversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
 * DTCCSubEventType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
 * DTCCSubEventType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
 * DTCCSubEventType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code
 * DTCCSubEventType4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
 * DTCCSubEventType5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType6Code
 * DTCCSubEventType6Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPTO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCSubEventTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCSubEventTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies an event (for example Cash Dividend) where DTC (the Depository
	 * Trust Company) offers a DRIP option as a default option (holder must opt
	 * out of the DRIP Option).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event (for example Cash Dividend) where DTC (the Depository Trust Company) offers a DRIP option as a default option (holder must opt out of the DRIP Option)."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode OptOut = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptOut";
			definition = "Identifies an event (for example Cash Dividend) where DTC (the Depository Trust Company) offers a DRIP option as a default option (holder must opt out of the DRIP Option).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "OPTO";
		}
	};
	/**
	 * Identifies an event where the Issue is eligible for a Dividend
	 * Reinvestment program at DTCC (The Depository Trust and Clearing
	 * Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentByDTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where the Issue is eligible for a Dividend Reinvestment program at DTCC (The Depository Trust and Clearing Corporation)."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode DividendReinvestmentByDTC = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentByDTC";
			definition = "Identifies an event where the Issue is eligible for a Dividend Reinvestment program at DTCC (The Depository Trust and Clearing Corporation).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "DRPD";
		}
	};
	/**
	 * Identifies a change in the place where the security is listed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a change in the place where the security is listed."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode PlaceOfListing = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Identifies a change in the place where the security is listed.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "PLCL";
		}
	};
	/**
	 * Identifies a change in Board Lot size.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a change in Board Lot size."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode BoardLot = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardLot";
			definition = "Identifies a change in Board Lot size.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "BLOT";
		}
	};
	/**
	 * Identifies an event that include notification of an interim payment in
	 * lieu of the original commitment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event that include notification of an interim payment in lieu of the original commitment."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode InterimPayment = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimPayment";
			definition = "Identifies an event that include notification of an interim payment in lieu of the original commitment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Identifies an event that include notification of a final payment in lieu
	 * of the original commitment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event that include notification of a final payment in lieu of the original commitment."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode FinalPayment = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalPayment";
			definition = "Identifies an event that include notification of a final payment in lieu of the original commitment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Identifies an event that involve a Stock Purchase Contract product that
	 * is offering an early settlement or remarketing feature prior to the
	 * contract's expiration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMRK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remarketing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event that involve a Stock Purchase Contract product that is offering an early settlement or remarketing feature prior to the contract's expiration."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Remarketing = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remarketing";
			definition = "Identifies an event that involve a Stock Purchase Contract product that is offering an early settlement or remarketing feature prior to the contract's expiration.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "RMRK";
		}
	};
	/**
	 * Identifies an event where "unwinding" of the basket of securities occurs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNWD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unwind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where \"unwinding\" of the basket of securities occurs."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Unwind = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unwind";
			definition = "Identifies an event where \"unwinding\" of the basket of securities occurs.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "UNWD";
		}
	};
	/**
	 * Identifies a meeting event called by the company on behalf of security
	 * holders at which the company can present corporate resolutions that may
	 * require a vote by the holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnualGeneral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a meeting event called by the company on behalf of security holders at which the company can present corporate resolutions that may require a vote by the holders."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode AnnualGeneral = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnualGeneral";
			definition = "Identifies a meeting event called by the company on behalf of security holders at which the company can present corporate resolutions that may require a vote by the holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "AMET";
		}
	};
	/**
	 * Identifies a meeting event called by the company when urgent matters need
	 * to be addressed before the next General Meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extraordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a meeting event called by the company when urgent matters need to be addressed before the next General Meeting."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Extraordinary = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extraordinary";
			definition = "Identifies a meeting event called by the company when urgent matters need to be addressed before the next General Meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "EXOM";
		}
	};
	/**
	 * Identifies a meeting event called by the company. Usually held annually.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a meeting event called by the company. Usually held annually."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Ordinary = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			definition = "Identifies a meeting event called by the company. Usually held annually.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "ORDM";
		}
	};
	/**
	 * Identifies a meeting event called by the company that cannot be
	 * categorized as Ordinary, Annual General, or Extraordinary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a meeting event called by the company that cannot be categorized as Ordinary, Annual General, or Extraordinary."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Special = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Special";
			definition = "Identifies a meeting event called by the company that cannot be categorized as Ordinary, Annual General, or Extraordinary.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "SPCL";
		}
	};
	/**
	 * Identifies an event where two companies exchange their shares during a
	 * merger. After the share exchange, one company becomes a subsidiary of the
	 * other and is no longer listed. Usually applicable to an event in JP
	 * markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where two companies exchange their shares during a merger. After the share exchange, one company becomes a subsidiary of the other and is no longer listed. Usually applicable to an event in JP markets."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode ShareExchange = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareExchange";
			definition = "Identifies an event where two companies exchange their shares during a merger. After the share exchange, one company becomes a subsidiary of the other and is no longer listed. Usually applicable to an event in JP markets.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "SHEX";
		}
	};
	/**
	 * Identifies an event where one company merges with the other and assumes
	 * the name of the surviving company. It is the standard market-accepted
	 * merger. Usually applicable to an event in JP markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where one company merges with the other and assumes the name of the surviving company. It is the standard market-accepted merger. Usually applicable to an event in JP markets."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Standard = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			definition = "Identifies an event where one company merges with the other and assumes the name of the surviving company. It is the standard market-accepted merger. Usually applicable to an event in JP markets.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "STDT";
		}
	};
	/**
	 * Identifies an event where one company transfers all of its shares to a
	 * newly created company. Usually applicable to an event in JP markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XFER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where one company transfers all of its shares to a newly created company. Usually applicable to an event in JP markets."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Transfer = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			definition = "Identifies an event where one company transfers all of its shares to a newly created company. Usually applicable to an event in JP markets.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "XFER";
		}
	};
	/**
	 * Indicates an event where the Issue has an early redemption feature. This
	 * feature allows the holder to elect to sell bonds back to the issuer on a
	 * predetermined basis (excluding monthly) according to specific priorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivorOptions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an event where the Issue has an early redemption feature. This feature allows the holder to elect to sell bonds back to the issuer on a predetermined basis (excluding monthly) according to specific priorities."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode SurvivorOptions = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivorOptions";
			definition = "Indicates an event where the Issue has an early redemption feature. This feature allows the holder to elect to sell bonds back to the issuer on a predetermined basis (excluding monthly) according to specific priorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "SOPT";
		}
	};
	/**
	 * Indicates an event where the issue has an early redemption feature that
	 * allows the holder to elect to sell bonds back to the issuer on a monthly
	 * basis, according to specified conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MBCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageBacked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an event where the issue has an early redemption feature that allows the holder to elect to sell bonds back to the issuer on a monthly basis, according to specified conditions."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode MortgageBacked = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageBacked";
			definition = "Indicates an event where the issue has an early redemption feature that allows the holder to elect to sell bonds back to the issuer on a monthly basis, according to specified conditions.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "MBCK";
		}
	};
	/**
	 * Identifies an event where the distribution is from the proceeds of the
	 * sale of assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SALE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where the distribution is from the proceeds of the sale of assets."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode SaleOfAssets = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssets";
			definition = "Identifies an event where the distribution is from the proceeds of the sale of assets.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "SALE";
		}
	};
	/**
	 * Identifies an event where the company is not issuing a security with the
	 * right to subscribe for additional shares. In these instances, a User
	 * CUSIP is created by DTC (The Depository Trust Company) as opposed to a
	 * company-issued CUSIP in order to identify these issues.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalRightsNotIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where the company is not issuing a security with the right to subscribe for additional shares. In these instances, a User CUSIP is created by DTC (The Depository Trust Company) as opposed to a company-issued CUSIP in order to identify these issues."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode PhysicalRightsNotIssued = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalRightsNotIssued";
			definition = "Identifies an event where the company is not issuing a security with the right to subscribe for additional shares. In these instances, a User CUSIP is created by DTC (The Depository Trust Company) as opposed to a company-issued CUSIP in order to identify these issues.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "PRNI";
		}
	};
	/**
	 * Identifies sale of rights event where issuers redeem poison pill rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoisonPill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies sale of rights event where issuers redeem poison pill rights."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode PoisonPill = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoisonPill";
			definition = "Identifies sale of rights event where issuers redeem poison pill rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "POPI";
		}
	};
	/**
	 * Identifies an event where the issuer offers a dividend reinvestment
	 * program that is not processed by DTC (the Depository Trust Company).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentByIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where the issuer offers a dividend reinvestment program that is not processed by DTC (the Depository Trust Company)."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode DividendReinvestmentByIssuer = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentByIssuer";
			definition = "Identifies an event where the issuer offers a dividend reinvestment program that is not processed by DTC (the Depository Trust Company).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "DRPI";
		}
	};
	/**
	 * Identifies an event where redemption shares are issued in addition to
	 * shares of the original security. This is related to the Mandatory
	 * Exchange event with the same sub-event type name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryRedemptionOfShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where redemption shares are issued in addition to shares of the original security. This is related to the Mandatory Exchange event with the same sub-event type name."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode MandatoryRedemptionOfShares = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryRedemptionOfShares";
			definition = "Identifies an event where redemption shares are issued in addition to shares of the original security. This is related to the Mandatory Exchange event with the same sub-event type name.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "MROS";
		}
	};
	/**
	 * Identifies an event involving the offer of shares by a corporation listed
	 * on the Australia Stock Exchange, in which ASIC will give relief so that
	 * the company can offer existing shareholders the opportunity to acquire
	 * small numbers of additional shares without needing a disclosure document
	 * or Product Disclosure Statement (PDS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharePurchasePlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event involving the offer of shares by a corporation listed on the Australia Stock Exchange, in which ASIC will give relief so that the company can offer existing shareholders the opportunity to acquire small numbers of additional shares without needing a disclosure document or Product Disclosure Statement (PDS)."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode SharePurchasePlan = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharePurchasePlan";
			definition = "Identifies an event involving the offer of shares by a corporation listed on the Australia Stock Exchange, in which ASIC will give relief so that the company can offer existing shareholders the opportunity to acquire small numbers of additional shares without needing a disclosure document or Product Disclosure Statement (PDS).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "SHPP";
		}
	};
	/**
	 * Identifies an event in certain markets where underlying rights are not
	 * issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event in certain markets where underlying rights are not issued."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode OpenOffer = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOffer";
			definition = "Identifies an event in certain markets where underlying rights are not issued.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "OPOF";
		}
	};
	/**
	 * Identifies a tender offer event on a Rights security. Holders must submit
	 * both the ordinary share(s) and right(s) to be eligible to receive the
	 * tender consideration. The ratio of ordinary shares to rights is defined
	 * in the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TWRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderWithRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a tender offer event on a Rights security. Holders must submit both the ordinary share(s) and right(s) to be eligible to receive the tender consideration. The ratio of ordinary shares to rights is defined in the offer."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode TenderWithRights = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderWithRights";
			definition = "Identifies a tender offer event on a Rights security. Holders must submit both the ordinary share(s) and right(s) to be eligible to receive the tender consideration. The ratio of ordinary shares to rights is defined in the offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "TWRI";
		}
	};
	/**
	 * Identifies DTC (the Depository Trust Company) specific sub-event where
	 * holders can elect to "sell" whole shares to satisfy fractional
	 * entitlements (usually as a result of a merger) at the beneficial owner
	 * level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CILI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashinLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies DTC (the Depository Trust Company) specific sub-event where holders can elect to \"sell\" whole shares to satisfy fractional entitlements (usually as a result of a merger) at the beneficial owner level."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode CashinLieu = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashinLieu";
			definition = "Identifies DTC (the Depository Trust Company) specific sub-event where holders can elect to \"sell\" whole shares to satisfy fractional entitlements (usually as a result of a merger) at the beneficial owner level.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "CILI";
		}
	};
	/**
	 * Identifies a tender offer event in which the holder can choose the price
	 * at which they are willing to tender their securities. This price may or
	 * may not be accepted by the offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidTenderSealedTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a tender offer event in which the holder can choose the price at which they are willing to tender their securities. This price may or may not be accepted by the offeror."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode BidTenderSealedTender = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidTenderSealedTender";
			definition = "Identifies a tender offer event in which the holder can choose the price at which they are willing to tender their securities. This price may or may not be accepted by the offeror.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "BTST";
		}
	};
	/**
	 * Identifies a tender offer event made by another company to purchase a
	 * portion or all of the outstanding shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FTPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferToPurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a tender offer event made by another company to purchase a portion or all of the outstanding shares."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode OfferToPurchase = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferToPurchase";
			definition = "Identifies a tender offer event made by another company to purchase a portion or all of the outstanding shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "FTPR";
		}
	};
	/**
	 * Identifies when the event security is an ADR. The underlying security is
	 * American Depositary Receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies when the event security is an ADR. The underlying security is American Depositary Receipt."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode ADR = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADR";
			definition = "Identifies when the event security is an ADR. The underlying security is American Depositary Receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "ADRS";
		}
	};
	/**
	 * Identifies a consent event with payout.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithPayout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a consent event with payout."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode WithPayout = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithPayout";
			definition = "Identifies a consent event with payout.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Identifies a consent event without payout.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithoutPayout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a consent event without payout."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode WithoutPayout = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithoutPayout";
			definition = "Identifies a consent event without payout.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "WITO";
		}
	};
	/**
	 * Identifies an event where a tax credit relating to the Build America
	 * Bonds will occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where a tax credit relating to the Build America Bonds will occur."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode TaxCredit = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCredit";
			definition = "Identifies an event where a tax credit relating to the Build America Bonds will occur.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "CTAX";
		}
	};
	/**
	 * Identifies an exchange offer on securities that are subject to Securities
	 * Rule 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "A144"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USLegal144A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an exchange offer on securities that are subject to Securities Rule 144A."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode USLegal144A = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USLegal144A";
			definition = "Identifies an exchange offer on securities that are subject to Securities Rule 144A.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "A144";
		}
	};
	/**
	 * Identifies an event where the payout will be both cash and securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAndSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where the payout will be both cash and securities."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode CashAndSecurities = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAndSecurities";
			definition = "Identifies an event where the payout will be both cash and securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "CASE";
		}
	};
	/**
	 * Identifies an exchange offer on securities that are subject to securities
	 * rule Reg S.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulationS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an exchange offer on securities that are subject to securities rule Reg S."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode RegulationS = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulationS";
			definition = "Identifies an exchange offer on securities that are subject to securities rule Reg S.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "REGS";
		}
	};
	/**
	 * Identifies a MMI Important Notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImportantNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a MMI Important Notice."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode ImportantNotice = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImportantNotice";
			definition = "Identifies a MMI Important Notice.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "NOTI";
		}
	};
	/**
	 * Identifies an event which will be based on record date holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasedOnRecordDateHoldings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event which will be based on record date holdings."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode BasedOnRecordDateHoldings = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasedOnRecordDateHoldings";
			definition = "Identifies an event which will be based on record date holdings.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "RDTH";
		}
	};
	/**
	 * Identifies an event where the presentation of securities will be
	 * required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event where the presentation of securities will be required."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode PresentationRequired = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationRequired";
			definition = "Identifies an event where the presentation of securities will be required.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "PREQ";
		}
	};
	/**
	 * Identifies an event where the payout will be cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies an event where the payout will be cash."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Cash = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			definition = "Identifies an event where the payout will be cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Identifies an event where the payout will be securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies an event where the payout will be securities."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Securities = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			definition = "Identifies an event where the payout will be securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Identifies a tender offer with a convert feature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertAndTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a tender offer with a convert feature."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode ConvertAndTender = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertAndTender";
			definition = "Identifies a tender offer with a convert feature.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "COTE";
		}
	};
	/**
	 * Identifies when a tender offer is a mini tender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MITE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies when a tender offer is a mini tender."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode MiniTender = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniTender";
			definition = "Identifies when a tender offer is a mini tender.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "MITE";
		}
	};
	/**
	 * Identifies when a tender offer is a self tender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies when a tender offer is a self tender."</li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode SelfTender = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfTender";
			definition = "Identifies when a tender offer is a self tender.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "SETE";
		}
	};
	/**
	 * Identifies when the event security is a GDR. The underlying security is a
	 * global depositary receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GDRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies when the event security is a GDR. The underlying security is a global depositary receipt."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode GDR = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GDR";
			definition = "Identifies when the event security is a GDR. The underlying security is a global depositary receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "GDRS";
		}
	};
	/**
	 * Identifies an event which has been considered a deemed distribution under
	 * Section 305(c) of the United States  Internal Revenue Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "C305"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedDividend305C"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event which has been considered a deemed distribution under Section 305(c) of the United States  Internal Revenue Code."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode DeemedDividend305C = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedDividend305C";
			definition = "Identifies an event which has been considered a deemed distribution under Section 305(c) of the United States  Internal Revenue Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "C305";
		}
	};
	/**
	 * Identifies an event which has been considered a dividend equivalent
	 * payment under Section 871(m) of the United States Internal Revenue Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "M871"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendEquivalentPayment871M"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event which has been considered a dividend equivalent payment under Section 871(m) of the United States Internal Revenue Code."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode DividendEquivalentPayment871M = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendEquivalentPayment871M";
			definition = "Identifies an event which has been considered a dividend equivalent payment under Section 871(m) of the United States Internal Revenue Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "M871";
		}
	};
	/**
	 * Identifies an event which is a full call or a maturity with conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
	 * DTCCSubEventTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an event which is a full call or a maturity with conversion."
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventTypeCode Conversion = new DTCCSubEventTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			definition = "Identifies an event which is a full call or a maturity with conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventTypeCode.mmObject();
			codeName = "CONV";
		}
	};
	final static private LinkedHashMap<String, DTCCSubEventTypeCode> codesByName = new LinkedHashMap<>();

	protected DTCCSubEventTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPTO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCSubEventTypeCode";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types.";
				derivation_lazy = () -> Arrays.asList(DTCCSubEventType2Code.mmObject(), DTCCSubEventType1Code.mmObject(), DTCCSubEventType3Code.mmObject(), DTCCSubEventType4Code.mmObject(), DTCCSubEventType5Code.mmObject(),
						DTCCSubEventType6Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCSubEventTypeCode.OptOut, com.tools20022.repository.codeset.DTCCSubEventTypeCode.DividendReinvestmentByDTC,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.PlaceOfListing, com.tools20022.repository.codeset.DTCCSubEventTypeCode.BoardLot, com.tools20022.repository.codeset.DTCCSubEventTypeCode.InterimPayment,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.FinalPayment, com.tools20022.repository.codeset.DTCCSubEventTypeCode.Remarketing, com.tools20022.repository.codeset.DTCCSubEventTypeCode.Unwind,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.AnnualGeneral, com.tools20022.repository.codeset.DTCCSubEventTypeCode.Extraordinary, com.tools20022.repository.codeset.DTCCSubEventTypeCode.Ordinary,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.Special, com.tools20022.repository.codeset.DTCCSubEventTypeCode.ShareExchange, com.tools20022.repository.codeset.DTCCSubEventTypeCode.Standard,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.Transfer, com.tools20022.repository.codeset.DTCCSubEventTypeCode.SurvivorOptions, com.tools20022.repository.codeset.DTCCSubEventTypeCode.MortgageBacked,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.SaleOfAssets, com.tools20022.repository.codeset.DTCCSubEventTypeCode.PhysicalRightsNotIssued, com.tools20022.repository.codeset.DTCCSubEventTypeCode.PoisonPill,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.DividendReinvestmentByIssuer, com.tools20022.repository.codeset.DTCCSubEventTypeCode.MandatoryRedemptionOfShares,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.SharePurchasePlan, com.tools20022.repository.codeset.DTCCSubEventTypeCode.OpenOffer, com.tools20022.repository.codeset.DTCCSubEventTypeCode.TenderWithRights,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.CashinLieu, com.tools20022.repository.codeset.DTCCSubEventTypeCode.BidTenderSealedTender,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.OfferToPurchase, com.tools20022.repository.codeset.DTCCSubEventTypeCode.ADR, com.tools20022.repository.codeset.DTCCSubEventTypeCode.WithPayout,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.WithoutPayout, com.tools20022.repository.codeset.DTCCSubEventTypeCode.TaxCredit, com.tools20022.repository.codeset.DTCCSubEventTypeCode.USLegal144A,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.CashAndSecurities, com.tools20022.repository.codeset.DTCCSubEventTypeCode.RegulationS, com.tools20022.repository.codeset.DTCCSubEventTypeCode.ImportantNotice,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.BasedOnRecordDateHoldings, com.tools20022.repository.codeset.DTCCSubEventTypeCode.PresentationRequired,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.Cash, com.tools20022.repository.codeset.DTCCSubEventTypeCode.Securities, com.tools20022.repository.codeset.DTCCSubEventTypeCode.ConvertAndTender,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.MiniTender, com.tools20022.repository.codeset.DTCCSubEventTypeCode.SelfTender, com.tools20022.repository.codeset.DTCCSubEventTypeCode.GDR,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.DeemedDividend305C, com.tools20022.repository.codeset.DTCCSubEventTypeCode.DividendEquivalentPayment871M,
						com.tools20022.repository.codeset.DTCCSubEventTypeCode.Conversion);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OptOut.getCodeName().get(), OptOut);
		codesByName.put(DividendReinvestmentByDTC.getCodeName().get(), DividendReinvestmentByDTC);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
		codesByName.put(BoardLot.getCodeName().get(), BoardLot);
		codesByName.put(InterimPayment.getCodeName().get(), InterimPayment);
		codesByName.put(FinalPayment.getCodeName().get(), FinalPayment);
		codesByName.put(Remarketing.getCodeName().get(), Remarketing);
		codesByName.put(Unwind.getCodeName().get(), Unwind);
		codesByName.put(AnnualGeneral.getCodeName().get(), AnnualGeneral);
		codesByName.put(Extraordinary.getCodeName().get(), Extraordinary);
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Special.getCodeName().get(), Special);
		codesByName.put(ShareExchange.getCodeName().get(), ShareExchange);
		codesByName.put(Standard.getCodeName().get(), Standard);
		codesByName.put(Transfer.getCodeName().get(), Transfer);
		codesByName.put(SurvivorOptions.getCodeName().get(), SurvivorOptions);
		codesByName.put(MortgageBacked.getCodeName().get(), MortgageBacked);
		codesByName.put(SaleOfAssets.getCodeName().get(), SaleOfAssets);
		codesByName.put(PhysicalRightsNotIssued.getCodeName().get(), PhysicalRightsNotIssued);
		codesByName.put(PoisonPill.getCodeName().get(), PoisonPill);
		codesByName.put(DividendReinvestmentByIssuer.getCodeName().get(), DividendReinvestmentByIssuer);
		codesByName.put(MandatoryRedemptionOfShares.getCodeName().get(), MandatoryRedemptionOfShares);
		codesByName.put(SharePurchasePlan.getCodeName().get(), SharePurchasePlan);
		codesByName.put(OpenOffer.getCodeName().get(), OpenOffer);
		codesByName.put(TenderWithRights.getCodeName().get(), TenderWithRights);
		codesByName.put(CashinLieu.getCodeName().get(), CashinLieu);
		codesByName.put(BidTenderSealedTender.getCodeName().get(), BidTenderSealedTender);
		codesByName.put(OfferToPurchase.getCodeName().get(), OfferToPurchase);
		codesByName.put(ADR.getCodeName().get(), ADR);
		codesByName.put(WithPayout.getCodeName().get(), WithPayout);
		codesByName.put(WithoutPayout.getCodeName().get(), WithoutPayout);
		codesByName.put(TaxCredit.getCodeName().get(), TaxCredit);
		codesByName.put(USLegal144A.getCodeName().get(), USLegal144A);
		codesByName.put(CashAndSecurities.getCodeName().get(), CashAndSecurities);
		codesByName.put(RegulationS.getCodeName().get(), RegulationS);
		codesByName.put(ImportantNotice.getCodeName().get(), ImportantNotice);
		codesByName.put(BasedOnRecordDateHoldings.getCodeName().get(), BasedOnRecordDateHoldings);
		codesByName.put(PresentationRequired.getCodeName().get(), PresentationRequired);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(ConvertAndTender.getCodeName().get(), ConvertAndTender);
		codesByName.put(MiniTender.getCodeName().get(), MiniTender);
		codesByName.put(SelfTender.getCodeName().get(), SelfTender);
		codesByName.put(GDR.getCodeName().get(), GDR);
		codesByName.put(DeemedDividend305C.getCodeName().get(), DeemedDividend305C);
		codesByName.put(DividendEquivalentPayment871M.getCodeName().get(), DividendEquivalentPayment871M);
		codesByName.put(Conversion.getCodeName().get(), Conversion);
	}

	public static DTCCSubEventTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCSubEventTypeCode[] values() {
		DTCCSubEventTypeCode[] values = new DTCCSubEventTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCSubEventTypeCode> {
		@Override
		public DTCCSubEventTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCSubEventTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}