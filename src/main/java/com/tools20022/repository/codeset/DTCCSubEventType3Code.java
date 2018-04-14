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
import com.tools20022.repository.codeset.DTCCSubEventType3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#PlaceOfListing
 * DTCCSubEventType3Code.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#BoardLot
 * DTCCSubEventType3Code.BoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#Remarketing
 * DTCCSubEventType3Code.Remarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#Unwind
 * DTCCSubEventType3Code.Unwind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#ShareExchange
 * DTCCSubEventType3Code.ShareExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#Standard
 * DTCCSubEventType3Code.Standard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#Transfer
 * DTCCSubEventType3Code.Transfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#SurvivorOptions
 * DTCCSubEventType3Code.SurvivorOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#MortgageBacked
 * DTCCSubEventType3Code.MortgageBacked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#SaleOfAssets
 * DTCCSubEventType3Code.SaleOfAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#PhysicalRightsNotIssued
 * DTCCSubEventType3Code.PhysicalRightsNotIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#PoisonPill
 * DTCCSubEventType3Code.PoisonPill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#DividendReinvestmentByIssuer
 * DTCCSubEventType3Code.DividendReinvestmentByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#MandatoryRedemptionOfShares
 * DTCCSubEventType3Code.MandatoryRedemptionOfShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#SharePurchasePlan
 * DTCCSubEventType3Code.SharePurchasePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#OpenOffer
 * DTCCSubEventType3Code.OpenOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#TenderWithRights
 * DTCCSubEventType3Code.TenderWithRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#CashinLieu
 * DTCCSubEventType3Code.CashinLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#BidTenderSealedTender
 * DTCCSubEventType3Code.BidTenderSealedTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#OfferToPurchase
 * DTCCSubEventType3Code.OfferToPurchase}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code#ADR
 * DTCCSubEventType3Code.ADR}</li>
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
 * "DTCCSubEventType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MROS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code
 * DTCCSubEventType2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCSubEventType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#PlaceOfListing
	 * DTCCSubEventType2Code.PlaceOfListing}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code PlaceOfListing = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			previousVersion_lazy = () -> DTCCSubEventType2Code.PlaceOfListing;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.PlaceOfListing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#BoardLot
	 * DTCCSubEventType2Code.BoardLot}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code BoardLot = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardLot";
			previousVersion_lazy = () -> DTCCSubEventType2Code.BoardLot;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.BoardLot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remarketing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#Remarketing
	 * DTCCSubEventType2Code.Remarketing}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code Remarketing = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remarketing";
			previousVersion_lazy = () -> DTCCSubEventType2Code.Remarketing;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.Remarketing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unwind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#Unwind
	 * DTCCSubEventType2Code.Unwind}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code Unwind = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unwind";
			previousVersion_lazy = () -> DTCCSubEventType2Code.Unwind;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.Unwind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#ShareExchange
	 * DTCCSubEventType2Code.ShareExchange}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code ShareExchange = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareExchange";
			previousVersion_lazy = () -> DTCCSubEventType2Code.ShareExchange;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.ShareExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#Standard
	 * DTCCSubEventType2Code.Standard}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code Standard = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			previousVersion_lazy = () -> DTCCSubEventType2Code.Standard;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.Standard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#Transfer
	 * DTCCSubEventType2Code.Transfer}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code Transfer = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			previousVersion_lazy = () -> DTCCSubEventType2Code.Transfer;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.Transfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivorOptions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#SurvivorOptions
	 * DTCCSubEventType2Code.SurvivorOptions}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code SurvivorOptions = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivorOptions";
			previousVersion_lazy = () -> DTCCSubEventType2Code.SurvivorOptions;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.SurvivorOptions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageBacked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#MortgageBacked
	 * DTCCSubEventType2Code.MortgageBacked}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code MortgageBacked = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageBacked";
			previousVersion_lazy = () -> DTCCSubEventType2Code.MortgageBacked;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.MortgageBacked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#SaleOfAssets
	 * DTCCSubEventType2Code.SaleOfAssets}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code SaleOfAssets = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssets";
			previousVersion_lazy = () -> DTCCSubEventType2Code.SaleOfAssets;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.SaleOfAssets.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalRightsNotIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#PhysicalRightsNotIssued
	 * DTCCSubEventType2Code.PhysicalRightsNotIssued}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code PhysicalRightsNotIssued = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalRightsNotIssued";
			previousVersion_lazy = () -> DTCCSubEventType2Code.PhysicalRightsNotIssued;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.PhysicalRightsNotIssued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoisonPill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#PoisonPill
	 * DTCCSubEventType2Code.PoisonPill}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code PoisonPill = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoisonPill";
			previousVersion_lazy = () -> DTCCSubEventType2Code.PoisonPill;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.PoisonPill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentByIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#DividendReinvestmentByIssuer
	 * DTCCSubEventType2Code.DividendReinvestmentByIssuer}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code DividendReinvestmentByIssuer = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentByIssuer";
			previousVersion_lazy = () -> DTCCSubEventType2Code.DividendReinvestmentByIssuer;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.DividendReinvestmentByIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryRedemptionOfShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#MandatoryRedemptionOfShares
	 * DTCCSubEventType2Code.MandatoryRedemptionOfShares}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code MandatoryRedemptionOfShares = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryRedemptionOfShares";
			previousVersion_lazy = () -> DTCCSubEventType2Code.MandatoryRedemptionOfShares;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.MandatoryRedemptionOfShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharePurchasePlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#SharePurchasePlan
	 * DTCCSubEventType2Code.SharePurchasePlan}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code SharePurchasePlan = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharePurchasePlan";
			previousVersion_lazy = () -> DTCCSubEventType2Code.SharePurchasePlan;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.SharePurchasePlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#OpenOffer
	 * DTCCSubEventType2Code.OpenOffer}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code OpenOffer = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOffer";
			previousVersion_lazy = () -> DTCCSubEventType2Code.OpenOffer;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.OpenOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderWithRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#TenderWithRights
	 * DTCCSubEventType2Code.TenderWithRights}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code TenderWithRights = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderWithRights";
			previousVersion_lazy = () -> DTCCSubEventType2Code.TenderWithRights;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.TenderWithRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashinLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#CashinLieu
	 * DTCCSubEventType2Code.CashinLieu}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code CashinLieu = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashinLieu";
			previousVersion_lazy = () -> DTCCSubEventType2Code.CashinLieu;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.CashinLieu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidTenderSealedTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#BidTenderSealedTender
	 * DTCCSubEventType2Code.BidTenderSealedTender}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code BidTenderSealedTender = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidTenderSealedTender";
			previousVersion_lazy = () -> DTCCSubEventType2Code.BidTenderSealedTender;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.BidTenderSealedTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferToPurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#OfferToPurchase
	 * DTCCSubEventType2Code.OfferToPurchase}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code OfferToPurchase = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferToPurchase";
			previousVersion_lazy = () -> DTCCSubEventType2Code.OfferToPurchase;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.OfferToPurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType3Code
	 * DTCCSubEventType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType2Code#ADR
	 * DTCCSubEventType2Code.ADR}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType3Code ADR = new DTCCSubEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADR";
			previousVersion_lazy = () -> DTCCSubEventType2Code.ADR;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType3Code.mmObject();
			codeName = DTCCSubEventTypeCode.ADR.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCSubEventType3Code> codesByName = new LinkedHashMap<>();

	protected DTCCSubEventType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MROS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCSubEventType3Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types.";
				previousVersion_lazy = () -> DTCCSubEventType2Code.mmObject();
				trace_lazy = () -> DTCCSubEventTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCSubEventType3Code.PlaceOfListing, com.tools20022.repository.codeset.DTCCSubEventType3Code.BoardLot,
						com.tools20022.repository.codeset.DTCCSubEventType3Code.Remarketing, com.tools20022.repository.codeset.DTCCSubEventType3Code.Unwind, com.tools20022.repository.codeset.DTCCSubEventType3Code.ShareExchange,
						com.tools20022.repository.codeset.DTCCSubEventType3Code.Standard, com.tools20022.repository.codeset.DTCCSubEventType3Code.Transfer, com.tools20022.repository.codeset.DTCCSubEventType3Code.SurvivorOptions,
						com.tools20022.repository.codeset.DTCCSubEventType3Code.MortgageBacked, com.tools20022.repository.codeset.DTCCSubEventType3Code.SaleOfAssets,
						com.tools20022.repository.codeset.DTCCSubEventType3Code.PhysicalRightsNotIssued, com.tools20022.repository.codeset.DTCCSubEventType3Code.PoisonPill,
						com.tools20022.repository.codeset.DTCCSubEventType3Code.DividendReinvestmentByIssuer, com.tools20022.repository.codeset.DTCCSubEventType3Code.MandatoryRedemptionOfShares,
						com.tools20022.repository.codeset.DTCCSubEventType3Code.SharePurchasePlan, com.tools20022.repository.codeset.DTCCSubEventType3Code.OpenOffer, com.tools20022.repository.codeset.DTCCSubEventType3Code.TenderWithRights,
						com.tools20022.repository.codeset.DTCCSubEventType3Code.CashinLieu, com.tools20022.repository.codeset.DTCCSubEventType3Code.BidTenderSealedTender,
						com.tools20022.repository.codeset.DTCCSubEventType3Code.OfferToPurchase, com.tools20022.repository.codeset.DTCCSubEventType3Code.ADR);
			}
		});
		return mmObject_lazy.get();
	}

	static {
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

	public static DTCCSubEventType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCSubEventType3Code[] values() {
		DTCCSubEventType3Code[] values = new DTCCSubEventType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCSubEventType3Code> {
		@Override
		public DTCCSubEventType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCSubEventType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}