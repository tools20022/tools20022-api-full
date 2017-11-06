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
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmInstituteCargoClauseA
 * InsuranceClauses1Code.mmInstituteCargoClauseA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmInstituteCargoClauseB
 * InsuranceClauses1Code.mmInstituteCargoClauseB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmInstituteCargoClauseC
 * InsuranceClauses1Code.mmInstituteCargoClauseC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmInstituteCargoClauseAir
 * InsuranceClauses1Code.mmInstituteCargoClauseAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmInstituteWarClauseCargo
 * InsuranceClauses1Code.mmInstituteWarClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmInstituteStrikesClauseCargo
 * InsuranceClauses1Code.mmInstituteStrikesClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmInstituteReplacementClause
 * InsuranceClauses1Code.mmInstituteReplacementClause}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmInstituteClassificationClause
 * InsuranceClauses1Code.mmInstituteClassificationClause}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmISMCodeEndorsement
 * InsuranceClauses1Code.mmISMCodeEndorsement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmComputerMilleniumClauseCargo
 * InsuranceClauses1Code.mmComputerMilleniumClauseCargo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code#mmInstituteRadioactiveContaminationExclusionClause
 * InsuranceClauses1Code.mmInstituteRadioactiveContaminationExclusionClause}</li>
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
	public static final MMCode mmInstituteCargoClauseA = new MMCode() {
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
	public static final MMCode mmInstituteCargoClauseB = new MMCode() {
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
	public static final MMCode mmInstituteCargoClauseC = new MMCode() {
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
	public static final MMCode mmInstituteCargoClauseAir = new MMCode() {
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
	public static final MMCode mmInstituteWarClauseCargo = new MMCode() {
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
	public static final MMCode mmInstituteStrikesClauseCargo = new MMCode() {
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
	public static final MMCode mmInstituteReplacementClause = new MMCode() {
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
	public static final MMCode mmInstituteClassificationClause = new MMCode() {
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
	public static final MMCode mmISMCodeEndorsement = new MMCode() {
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
	public static final MMCode mmComputerMilleniumClauseCargo = new MMCode() {
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
	public static final MMCode mmInstituteRadioactiveContaminationExclusionClause = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteRadioactiveContaminationExclusionClause";
			owner_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ICCA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InsuranceClauses1Code";
				definition = "List of standards insurance clauses. (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InsuranceClauses1Code.mmInstituteCargoClauseA, com.tools20022.repository.codeset.InsuranceClauses1Code.mmInstituteCargoClauseB,
						com.tools20022.repository.codeset.InsuranceClauses1Code.mmInstituteCargoClauseC, com.tools20022.repository.codeset.InsuranceClauses1Code.mmInstituteCargoClauseAir,
						com.tools20022.repository.codeset.InsuranceClauses1Code.mmInstituteWarClauseCargo, com.tools20022.repository.codeset.InsuranceClauses1Code.mmInstituteStrikesClauseCargo,
						com.tools20022.repository.codeset.InsuranceClauses1Code.mmInstituteReplacementClause, com.tools20022.repository.codeset.InsuranceClauses1Code.mmInstituteClassificationClause,
						com.tools20022.repository.codeset.InsuranceClauses1Code.mmISMCodeEndorsement, com.tools20022.repository.codeset.InsuranceClauses1Code.mmComputerMilleniumClauseCargo,
						com.tools20022.repository.codeset.InsuranceClauses1Code.mmInstituteRadioactiveContaminationExclusionClause);
				trace_lazy = () -> InsuranceClausesCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}