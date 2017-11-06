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
import com.tools20022.repository.codeset.CustomerHandlingInstructionsCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Firms that are taking in orders manually but routing for execution
 * electronically and for reporting to OATS must capture the client's handling
 * instructions.This is intended for compliance reporting only ( OATS Phase III
 * regulatory requirement).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructionsCode
 * CustomerHandlingInstructionsCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmFillOrKill
 * CustomerHandlingInstructions1Code.mmFillOrKill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmImmediateOrCancel
 * CustomerHandlingInstructions1Code.mmImmediateOrCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmAllOrNone
 * CustomerHandlingInstructions1Code.mmAllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmScale
 * CustomerHandlingInstructions1Code.mmScale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmWork
 * CustomerHandlingInstructions1Code.mmWork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmAddOnOrder
 * CustomerHandlingInstructions1Code.mmAddOnOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmExchangeForPhysicalTransaction
 * CustomerHandlingInstructions1Code.mmExchangeForPhysicalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmImbalanceOnly
 * CustomerHandlingInstructions1Code.mmImbalanceOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmPegged
 * CustomerHandlingInstructions1Code.mmPegged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code#mmNotHeld
 * CustomerHandlingInstructions1Code.mmNotHeld}</li>
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
 * <li>"FIKI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerHandlingInstructions1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Firms that are taking in orders manually but routing for execution electronically and for reporting to OATS must capture the client's handling instructions.This is intended for compliance reporting only ( OATS Phase III regulatory requirement)."
 * </li>
 * </ul>
 */
public class CustomerHandlingInstructions1Code extends CustomerHandlingInstructionsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FillOrKill"</li>
	 * </ul>
	 */
	public static final MMCode mmFillOrKill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FillOrKill";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImmediateOrCancel"</li>
	 * </ul>
	 */
	public static final MMCode mmImmediateOrCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImmediateOrCancel";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * </ul>
	 */
	public static final MMCode mmAllOrNone = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scale"</li>
	 * </ul>
	 */
	public static final MMCode mmScale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Scale";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Work"</li>
	 * </ul>
	 */
	public static final MMCode mmWork = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Work";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddOnOrder"</li>
	 * </ul>
	 */
	public static final MMCode mmAddOnOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddOnOrder";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysicalTransaction"</li>
	 * </ul>
	 */
	public static final MMCode mmExchangeForPhysicalTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysicalTransaction";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImbalanceOnly"</li>
	 * </ul>
	 */
	public static final MMCode mmImbalanceOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImbalanceOnly";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pegged"</li>
	 * </ul>
	 */
	public static final MMCode mmPegged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pegged";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerHandlingInstructions1Code
	 * CustomerHandlingInstructions1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotHeld"</li>
	 * </ul>
	 */
	public static final MMCode mmNotHeld = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotHeld";
			owner_lazy = () -> CustomerHandlingInstructions1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("FIKI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CustomerHandlingInstructions1Code";
				definition = "Firms that are taking in orders manually but routing for execution electronically and for reporting to OATS must capture the client's handling instructions.This is intended for compliance reporting only ( OATS Phase III regulatory requirement).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmFillOrKill, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmImmediateOrCancel,
						com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmAllOrNone, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmScale,
						com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmWork, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmAddOnOrder,
						com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmExchangeForPhysicalTransaction, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmImbalanceOnly,
						com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmPegged, com.tools20022.repository.codeset.CustomerHandlingInstructions1Code.mmNotHeld);
				trace_lazy = () -> CustomerHandlingInstructionsCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}