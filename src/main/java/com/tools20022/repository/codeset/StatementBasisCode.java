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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of balances on which the statement is prepared.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.StatementBasis1Code
 * StatementBasis1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatementBasis2Code
 * StatementBasis2Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementBasisCode#mmContractual
 * StatementBasisCode.mmContractual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementBasisCode#mmSettled
 * StatementBasisCode.mmSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementBasisCode#mmTraded
 * StatementBasisCode.mmTraded}</li>
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
 * <li>"CONT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementBasisCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of balances on which the statement is prepared."</li>
 * </ul>
 */
public class StatementBasisCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The statement is based on contractual settlement date irrespective of
	 * settled data positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementBasisCode
	 * StatementBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contractual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The statement is based on contractual settlement date irrespective of settled data positions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmContractual = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Contractual";
			definition = "The statement is based on contractual settlement date irrespective of settled data positions.";
			owner_lazy = () -> StatementBasisCode.mmObject();
			codeName = "CONT";
		}
	};
	/**
	 * The statement is based on settled date positions to the knowledge of the
	 * sender at the time of the statement preparation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementBasisCode
	 * StatementBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The statement is based on settled date positions to the knowledge of the sender at the time of the statement preparation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSettled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settled";
			definition = "The statement is based on settled date positions to the knowledge of the sender at the time of the statement preparation.";
			owner_lazy = () -> StatementBasisCode.mmObject();
			codeName = "SETT";
		}
	};
	/**
	 * The statement is based on trade date positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementBasisCode
	 * StatementBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The statement is based on trade date positions."</li>
	 * </ul>
	 */
	public static final MMCode mmTraded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Traded";
			definition = "The statement is based on trade date positions.";
			owner_lazy = () -> StatementBasisCode.mmObject();
			codeName = "TRAD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CONT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementBasisCode";
				definition = "Specifies the type of balances on which the statement is prepared.";
				code_lazy = () -> Arrays.asList(StatementBasisCode.mmContractual, StatementBasisCode.mmSettled, StatementBasisCode.mmTraded);
				derivation_lazy = () -> Arrays.asList(StatementBasis1Code.mmObject(), StatementBasis2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}