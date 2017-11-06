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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies whether the movement on a securities account was the result of a
 * deliver or a receive instruction and whether the instruction was free or
 * against payment
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code#mmReceiveFree
 * SettlementInstructionType1Code.mmReceiveFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code#mmReceiveAgainstPayment
 * SettlementInstructionType1Code.mmReceiveAgainstPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code#mmDeliverFree
 * SettlementInstructionType1Code.mmDeliverFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code#mmDeliverAgainstPayment
 * SettlementInstructionType1Code.mmDeliverAgainstPayment}</li>
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
 * <li>"RECE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInstructionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies whether  the movement on a securities account was the result of  a deliver or a receive instruction and whether the instruction was free or against payment"
 * </li>
 * </ul>
 */
public class SettlementInstructionType1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The transaction is a receive free
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code
	 * SettlementInstructionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiveFree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The transaction is a receive free"</li>
	 * </ul>
	 */
	public static final MMCode mmReceiveFree = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ReceiveFree";
			definition = "The transaction is a receive free";
			owner_lazy = () -> SettlementInstructionType1Code.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * The transaction is a receive against payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code
	 * SettlementInstructionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiveAgainstPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The transaction is a receive against payment."</li>
	 * </ul>
	 */
	public static final MMCode mmReceiveAgainstPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ReceiveAgainstPayment";
			definition = "The transaction is a receive against payment.";
			owner_lazy = () -> SettlementInstructionType1Code.mmObject();
			codeName = "RVPA";
		}
	};
	/**
	 * The transaction is a deliver free.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code
	 * SettlementInstructionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverFree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The transaction is a deliver free."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverFree = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "DeliverFree";
			definition = "The transaction is a deliver free.";
			owner_lazy = () -> SettlementInstructionType1Code.mmObject();
			codeName = "DELI";
		}
	};
	/**
	 * The transaction is a deliver against payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionType1Code
	 * SettlementInstructionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverAgainstPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The transaction is a deliver against payment."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverAgainstPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "DeliverAgainstPayment";
			definition = "The transaction is a deliver against payment.";
			owner_lazy = () -> SettlementInstructionType1Code.mmObject();
			codeName = "DVPA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("RECE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				name = "SettlementInstructionType1Code";
				definition = "Identifies whether  the movement on a securities account was the result of  a deliver or a receive instruction and whether the instruction was free or against payment";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementInstructionType1Code.mmReceiveFree, com.tools20022.repository.codeset.SettlementInstructionType1Code.mmReceiveAgainstPayment,
						com.tools20022.repository.codeset.SettlementInstructionType1Code.mmDeliverFree, com.tools20022.repository.codeset.SettlementInstructionType1Code.mmDeliverAgainstPayment);
			}
		});
		return mmObject_lazy.get();
	}
}