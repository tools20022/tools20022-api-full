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
import com.tools20022.repository.codeset.InsuranceClausesCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * List of standards insurance clauses. (standard policy wordings issued by the
 * Institute of London Underwriters or the American Institute of Marine
 * Underwriters)
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
 * InsuranceClausesCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#InstituteCargoClauseA
 * InsuranceClauses1Code.InstituteCargoClauseA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#InstituteCargoClauseB
 * InsuranceClauses1Code.InstituteCargoClauseB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#InstituteCargoClauseC
 * InsuranceClauses1Code.InstituteCargoClauseC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#InstituteCargoClauseAir
 * InsuranceClauses1Code.InstituteCargoClauseAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#InstituteWarClauseCargo
 * InsuranceClauses1Code.InstituteWarClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#InstituteStrikesClauseCargo
 * InsuranceClauses1Code.InstituteStrikesClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#InstituteReplacementClause
 * InsuranceClauses1Code.InstituteReplacementClause}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#InstituteClassificationClause
 * InsuranceClauses1Code.InstituteClassificationClause}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#ISMCodeEndorsement
 * InsuranceClauses1Code.ISMCodeEndorsement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#ComputerMilleniumClauseCargo
 * InsuranceClauses1Code.ComputerMilleniumClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#InstituteRadioactiveContaminationExclusionClause
 * InsuranceClauses1Code.InstituteRadioactiveContaminationExclusionClause}</li>
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
 * <li>"ICCA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InsuranceClauses1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of standards insurance clauses. (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)"
 * </li>
 * </ul>
 */
public class InsuranceClauses1Code extends InsuranceClausesCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseA"</li>
	 * </ul>
	 */
	public static final MMCode InstituteCargoClauseA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseA";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseB"</li>
	 * </ul>
	 */
	public static final MMCode InstituteCargoClauseB = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseB";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseC"</li>
	 * </ul>
	 */
	public static final MMCode InstituteCargoClauseC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseC";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseAir"</li>
	 * </ul>
	 */
	public static final MMCode InstituteCargoClauseAir = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseAir";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteWarClauseCargo"</li>
	 * </ul>
	 */
	public static final MMCode InstituteWarClauseCargo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteWarClauseCargo";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteStrikesClauseCargo"</li>
	 * </ul>
	 */
	public static final MMCode InstituteStrikesClauseCargo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteStrikesClauseCargo";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteReplacementClause"</li>
	 * </ul>
	 */
	public static final MMCode InstituteReplacementClause = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteReplacementClause";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteClassificationClause"</li>
	 * </ul>
	 */
	public static final MMCode InstituteClassificationClause = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteClassificationClause";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISMCodeEndorsement"</li>
	 * </ul>
	 */
	public static final MMCode ISMCodeEndorsement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISMCodeEndorsement";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComputerMilleniumClauseCargo"</li>
	 * </ul>
	 */
	public static final MMCode ComputerMilleniumClauseCargo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComputerMilleniumClauseCargo";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteRadioactiveContaminationExclusionClause"</li>
	 * </ul>
	 */
	public static final MMCode InstituteRadioactiveContaminationExclusionClause = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteRadioactiveContaminationExclusionClause";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ICCA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InsuranceClauses1Code";
				definition = "List of standards insurance clauses. (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteCargoClauseA, com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteCargoClauseB,
						com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteCargoClauseC, com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteCargoClauseAir,
						com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteWarClauseCargo, com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteStrikesClauseCargo,
						com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteReplacementClause, com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteClassificationClause,
						com.tools20022.repository.codeset.InsuranceClauses1Code.ISMCodeEndorsement, com.tools20022.repository.codeset.InsuranceClauses1Code.ComputerMilleniumClauseCargo,
						com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteRadioactiveContaminationExclusionClause);
				trace_lazy = () -> InsuranceClausesCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}