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
import com.tools20022.repository.codeset.DTCCSubEventType2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#OptOut
 * DTCCSubEventType2Code.OptOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#DividendReinvestmentByDTC
 * DTCCSubEventType2Code.DividendReinvestmentByDTC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#PlaceOfListing
 * DTCCSubEventType2Code.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#BoardLot
 * DTCCSubEventType2Code.BoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#Remarketing
 * DTCCSubEventType2Code.Remarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#Unwind
 * DTCCSubEventType2Code.Unwind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#ShareExchange
 * DTCCSubEventType2Code.ShareExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#Standard
 * DTCCSubEventType2Code.Standard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#Transfer
 * DTCCSubEventType2Code.Transfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#SurvivorOptions
 * DTCCSubEventType2Code.SurvivorOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#MortgageBacked
 * DTCCSubEventType2Code.MortgageBacked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#SaleOfAssets
 * DTCCSubEventType2Code.SaleOfAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#PhysicalRightsNotIssued
 * DTCCSubEventType2Code.PhysicalRightsNotIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#PoisonPill
 * DTCCSubEventType2Code.PoisonPill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#DividendReinvestmentByIssuer
 * DTCCSubEventType2Code.DividendReinvestmentByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#MandatoryRedemptionOfShares
 * DTCCSubEventType2Code.MandatoryRedemptionOfShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#SharePurchasePlan
 * DTCCSubEventType2Code.SharePurchasePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#OpenOffer
 * DTCCSubEventType2Code.OpenOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#TenderWithRights
 * DTCCSubEventType2Code.TenderWithRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#CashinLieu
 * DTCCSubEventType2Code.CashinLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#BidTenderSealedTender
 * DTCCSubEventType2Code.BidTenderSealedTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#OfferToPurchase
 * DTCCSubEventType2Code.OfferToPurchase}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#ADR
 * DTCCSubEventType2Code.ADR}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
 * DTCCSubEventTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCSubEventType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types."
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
 * DTCCSubEventType3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCSubEventType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code OptOut = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptOut";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.OptOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentByDTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code DividendReinvestmentByDTC = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentByDTC";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.DividendReinvestmentByDTC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#PlaceOfListing
	 * DTCCSubEventType3Code.PlaceOfListing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code PlaceOfListing = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.PlaceOfListing);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.PlaceOfListing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#BoardLot
	 * DTCCSubEventType3Code.BoardLot}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code BoardLot = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardLot";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.BoardLot);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.BoardLot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remarketing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#Remarketing
	 * DTCCSubEventType3Code.Remarketing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code Remarketing = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remarketing";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.Remarketing);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.Remarketing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unwind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#Unwind
	 * DTCCSubEventType3Code.Unwind}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code Unwind = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unwind";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.Unwind);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.Unwind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#ShareExchange
	 * DTCCSubEventType3Code.ShareExchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code ShareExchange = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareExchange";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.ShareExchange);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.ShareExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#Standard
	 * DTCCSubEventType3Code.Standard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code Standard = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.Standard);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.Standard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#Transfer
	 * DTCCSubEventType3Code.Transfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code Transfer = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.Transfer);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.Transfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivorOptions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#SurvivorOptions
	 * DTCCSubEventType3Code.SurvivorOptions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code SurvivorOptions = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivorOptions";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.SurvivorOptions);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.SurvivorOptions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageBacked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#MortgageBacked
	 * DTCCSubEventType3Code.MortgageBacked}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code MortgageBacked = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageBacked";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.MortgageBacked);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.MortgageBacked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#SaleOfAssets
	 * DTCCSubEventType3Code.SaleOfAssets}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code SaleOfAssets = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssets";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.SaleOfAssets);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.SaleOfAssets.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalRightsNotIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#PhysicalRightsNotIssued
	 * DTCCSubEventType3Code.PhysicalRightsNotIssued}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code PhysicalRightsNotIssued = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalRightsNotIssued";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.PhysicalRightsNotIssued);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.PhysicalRightsNotIssued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoisonPill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#PoisonPill
	 * DTCCSubEventType3Code.PoisonPill}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code PoisonPill = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoisonPill";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.PoisonPill);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.PoisonPill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentByIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#DividendReinvestmentByIssuer
	 * DTCCSubEventType3Code.DividendReinvestmentByIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code DividendReinvestmentByIssuer = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentByIssuer";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.DividendReinvestmentByIssuer);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.DividendReinvestmentByIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryRedemptionOfShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#MandatoryRedemptionOfShares
	 * DTCCSubEventType3Code.MandatoryRedemptionOfShares}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code MandatoryRedemptionOfShares = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryRedemptionOfShares";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.MandatoryRedemptionOfShares);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.MandatoryRedemptionOfShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharePurchasePlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#SharePurchasePlan
	 * DTCCSubEventType3Code.SharePurchasePlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code SharePurchasePlan = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharePurchasePlan";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.SharePurchasePlan);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.SharePurchasePlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#OpenOffer
	 * DTCCSubEventType3Code.OpenOffer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code OpenOffer = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOffer";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.OpenOffer);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.OpenOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderWithRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#TenderWithRights
	 * DTCCSubEventType3Code.TenderWithRights}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code TenderWithRights = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderWithRights";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.TenderWithRights);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.TenderWithRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashinLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#CashinLieu
	 * DTCCSubEventType3Code.CashinLieu}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code CashinLieu = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashinLieu";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.CashinLieu);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.CashinLieu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidTenderSealedTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#BidTenderSealedTender
	 * DTCCSubEventType3Code.BidTenderSealedTender}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code BidTenderSealedTender = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidTenderSealedTender";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.BidTenderSealedTender);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.BidTenderSealedTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferToPurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#OfferToPurchase
	 * DTCCSubEventType3Code.OfferToPurchase}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code OfferToPurchase = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferToPurchase";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.OfferToPurchase);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.OfferToPurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
	 * DTCCSubEventType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#ADR
	 * DTCCSubEventType3Code.ADR}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DTCCSubEventType2Code ADR = new DTCCSubEventType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADR";
			nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.ADR);
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType2Code.mmObject();
			codeName = DTCCSubEventTypeCode.ADR.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCSubEventType2Code> codesByName = new LinkedHashMap<>();

	protected DTCCSubEventType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPTO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCSubEventType2Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types.";
				nextVersions_lazy = () -> Arrays.asList(DTCCSubEventType3Code.mmObject());
				trace_lazy = () -> DTCCSubEventTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCSubEventType2Code.OptOut, com.tools20022.repository.codeset.DTCCSubEventType2Code.DividendReinvestmentByDTC,
						com.tools20022.repository.codeset.DTCCSubEventType2Code.PlaceOfListing, com.tools20022.repository.codeset.DTCCSubEventType2Code.BoardLot, com.tools20022.repository.codeset.DTCCSubEventType2Code.Remarketing,
						com.tools20022.repository.codeset.DTCCSubEventType2Code.Unwind, com.tools20022.repository.codeset.DTCCSubEventType2Code.ShareExchange, com.tools20022.repository.codeset.DTCCSubEventType2Code.Standard,
						com.tools20022.repository.codeset.DTCCSubEventType2Code.Transfer, com.tools20022.repository.codeset.DTCCSubEventType2Code.SurvivorOptions, com.tools20022.repository.codeset.DTCCSubEventType2Code.MortgageBacked,
						com.tools20022.repository.codeset.DTCCSubEventType2Code.SaleOfAssets, com.tools20022.repository.codeset.DTCCSubEventType2Code.PhysicalRightsNotIssued,
						com.tools20022.repository.codeset.DTCCSubEventType2Code.PoisonPill, com.tools20022.repository.codeset.DTCCSubEventType2Code.DividendReinvestmentByIssuer,
						com.tools20022.repository.codeset.DTCCSubEventType2Code.MandatoryRedemptionOfShares, com.tools20022.repository.codeset.DTCCSubEventType2Code.SharePurchasePlan,
						com.tools20022.repository.codeset.DTCCSubEventType2Code.OpenOffer, com.tools20022.repository.codeset.DTCCSubEventType2Code.TenderWithRights, com.tools20022.repository.codeset.DTCCSubEventType2Code.CashinLieu,
						com.tools20022.repository.codeset.DTCCSubEventType2Code.BidTenderSealedTender, com.tools20022.repository.codeset.DTCCSubEventType2Code.OfferToPurchase, com.tools20022.repository.codeset.DTCCSubEventType2Code.ADR);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OptOut.getCodeName().get(), OptOut);
		codesByName.put(DividendReinvestmentByDTC.getCodeName().get(), DividendReinvestmentByDTC);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
		codesByName.put(BoardLot.getCodeName().get(), BoardLot);
		codesByName.put(Remarketing.getCodeName().get(), Remarketing);
		codesByName.put(Unwind.getCodeName().get(), Unwind);
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
	}

	public static DTCCSubEventType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCSubEventType2Code[] values() {
		DTCCSubEventType2Code[] values = new DTCCSubEventType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCSubEventType2Code> {
		@Override
		public DTCCSubEventType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCSubEventType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}