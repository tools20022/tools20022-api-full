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
import com.tools20022.repository.codeset.IncotermsCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A set of international standard trade terms (delivery terms) used to
 * designate a point at which the costs and risks of transport are divided
 * between the buyer and the seller.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IncotermsCode IncotermsCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmExWorks
 * Incoterms1Code.mmExWorks}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmFreeCarrier
 * Incoterms1Code.mmFreeCarrier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmFreeAlongsideShip
 * Incoterms1Code.mmFreeAlongsideShip}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmFreeOnBoard
 * Incoterms1Code.mmFreeOnBoard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmCostAndFreight
 * Incoterms1Code.mmCostAndFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmCostInsuranceAndFreight
 * Incoterms1Code.mmCostInsuranceAndFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmCarriagePaid
 * Incoterms1Code.mmCarriagePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmCarriageAndInsurancePaid
 * Incoterms1Code.mmCarriageAndInsurancePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmDeliveredAtFrontier
 * Incoterms1Code.mmDeliveredAtFrontier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmDeliveredExShip
 * Incoterms1Code.mmDeliveredExShip}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmDeliveredExQuay
 * Incoterms1Code.mmDeliveredExQuay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmDeliveredDutyUnpaid
 * Incoterms1Code.mmDeliveredDutyUnpaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code#mmDeliveredDutyPaid
 * Incoterms1Code.mmDeliveredDutyPaid}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXW"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Incoterms1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A set of international standard trade terms (delivery terms) used to designate a point at which the costs and risks of transport are divided between the buyer and the seller."
 * </li>
 * </ul>
 */
public class Incoterms1Code extends IncotermsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExWorks"</li>
	 * </ul>
	 */
	public static final MMCode mmExWorks = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExWorks";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeCarrier"</li>
	 * </ul>
	 */
	public static final MMCode mmFreeCarrier = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeCarrier";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeAlongsideShip"</li>
	 * </ul>
	 */
	public static final MMCode mmFreeAlongsideShip = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeAlongsideShip";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreeOnBoard"</li>
	 * </ul>
	 */
	public static final MMCode mmFreeOnBoard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreeOnBoard";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostAndFreight"</li>
	 * </ul>
	 */
	public static final MMCode mmCostAndFreight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CostAndFreight";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CostInsuranceAndFreight"</li>
	 * </ul>
	 */
	public static final MMCode mmCostInsuranceAndFreight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CostInsuranceAndFreight";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarriagePaid"</li>
	 * </ul>
	 */
	public static final MMCode mmCarriagePaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarriagePaid";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarriageAndInsurancePaid"</li>
	 * </ul>
	 */
	public static final MMCode mmCarriageAndInsurancePaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarriageAndInsurancePaid";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredAtFrontier"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredAtFrontier = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredAtFrontier";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredExShip"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredExShip = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredExShip";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredExQuay"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredExQuay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredExQuay";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredDutyUnpaid"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredDutyUnpaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredDutyUnpaid";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Incoterms1Code
	 * Incoterms1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveredDutyPaid"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveredDutyPaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveredDutyPaid";
			owner_lazy = () -> Incoterms1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("EXW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Incoterms1Code";
				definition = "A set of international standard trade terms (delivery terms) used to designate a point at which the costs and risks of transport are divided between the buyer and the seller.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Incoterms1Code.mmExWorks, com.tools20022.repository.codeset.Incoterms1Code.mmFreeCarrier,
						com.tools20022.repository.codeset.Incoterms1Code.mmFreeAlongsideShip, com.tools20022.repository.codeset.Incoterms1Code.mmFreeOnBoard, com.tools20022.repository.codeset.Incoterms1Code.mmCostAndFreight,
						com.tools20022.repository.codeset.Incoterms1Code.mmCostInsuranceAndFreight, com.tools20022.repository.codeset.Incoterms1Code.mmCarriagePaid,
						com.tools20022.repository.codeset.Incoterms1Code.mmCarriageAndInsurancePaid, com.tools20022.repository.codeset.Incoterms1Code.mmDeliveredAtFrontier,
						com.tools20022.repository.codeset.Incoterms1Code.mmDeliveredExShip, com.tools20022.repository.codeset.Incoterms1Code.mmDeliveredExQuay, com.tools20022.repository.codeset.Incoterms1Code.mmDeliveredDutyUnpaid,
						com.tools20022.repository.codeset.Incoterms1Code.mmDeliveredDutyPaid);
				trace_lazy = () -> IncotermsCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}