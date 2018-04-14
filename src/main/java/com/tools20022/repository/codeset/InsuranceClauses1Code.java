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
import com.tools20022.repository.codeset.InsuranceClauses1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * List of standards insurance clauses. (standard policy wordings issued by the
 * Institute of London Underwriters or the American Institute of Marine
 * Underwriters).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InsuranceClausesCode
 * InsuranceClausesCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InsuranceClauses1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "List of standards insurance clauses. (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters)."
 * </li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InsuranceClauses1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code InstituteCargoClauseA = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseA";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.InstituteCargoClauseA.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code InstituteCargoClauseB = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseB";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.InstituteCargoClauseB.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code InstituteCargoClauseC = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseC";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.InstituteCargoClauseC.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteCargoClauseAir"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code InstituteCargoClauseAir = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteCargoClauseAir";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.InstituteCargoClauseAir.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteWarClauseCargo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code InstituteWarClauseCargo = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteWarClauseCargo";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.InstituteWarClauseCargo.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteStrikesClauseCargo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code InstituteStrikesClauseCargo = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteStrikesClauseCargo";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.InstituteStrikesClauseCargo.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteReplacementClause"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code InstituteReplacementClause = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteReplacementClause";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.InstituteReplacementClause.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteClassificationClause"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code InstituteClassificationClause = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteClassificationClause";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.InstituteClassificationClause.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISMCodeEndorsement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code ISMCodeEndorsement = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISMCodeEndorsement";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.ISMCodeEndorsement.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComputerMilleniumClauseCargo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code ComputerMilleniumClauseCargo = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComputerMilleniumClauseCargo";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.ComputerMilleniumClauseCargo.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstituteRadioactiveContaminationExclusionClause"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InsuranceClauses1Code InstituteRadioactiveContaminationExclusionClause = new InsuranceClauses1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstituteRadioactiveContaminationExclusionClause";
			owner_lazy = () -> com.tools20022.repository.codeset.InsuranceClauses1Code.mmObject();
			codeName = InsuranceClausesCode.InstituteRadioactiveContaminationExclusionClause.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InsuranceClauses1Code> codesByName = new LinkedHashMap<>();

	protected InsuranceClauses1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ICCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InsuranceClauses1Code";
				definition = "List of standards insurance clauses. (standard policy wordings issued by the Institute of London Underwriters or the American Institute of Marine Underwriters).";
				trace_lazy = () -> InsuranceClausesCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteCargoClauseA, com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteCargoClauseB,
						com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteCargoClauseC, com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteCargoClauseAir,
						com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteWarClauseCargo, com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteStrikesClauseCargo,
						com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteReplacementClause, com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteClassificationClause,
						com.tools20022.repository.codeset.InsuranceClauses1Code.ISMCodeEndorsement, com.tools20022.repository.codeset.InsuranceClauses1Code.ComputerMilleniumClauseCargo,
						com.tools20022.repository.codeset.InsuranceClauses1Code.InstituteRadioactiveContaminationExclusionClause);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InstituteCargoClauseA.getCodeName().get(), InstituteCargoClauseA);
		codesByName.put(InstituteCargoClauseB.getCodeName().get(), InstituteCargoClauseB);
		codesByName.put(InstituteCargoClauseC.getCodeName().get(), InstituteCargoClauseC);
		codesByName.put(InstituteCargoClauseAir.getCodeName().get(), InstituteCargoClauseAir);
		codesByName.put(InstituteWarClauseCargo.getCodeName().get(), InstituteWarClauseCargo);
		codesByName.put(InstituteStrikesClauseCargo.getCodeName().get(), InstituteStrikesClauseCargo);
		codesByName.put(InstituteReplacementClause.getCodeName().get(), InstituteReplacementClause);
		codesByName.put(InstituteClassificationClause.getCodeName().get(), InstituteClassificationClause);
		codesByName.put(ISMCodeEndorsement.getCodeName().get(), ISMCodeEndorsement);
		codesByName.put(ComputerMilleniumClauseCargo.getCodeName().get(), ComputerMilleniumClauseCargo);
		codesByName.put(InstituteRadioactiveContaminationExclusionClause.getCodeName().get(), InstituteRadioactiveContaminationExclusionClause);
	}

	public static InsuranceClauses1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InsuranceClauses1Code[] values() {
		InsuranceClauses1Code[] values = new InsuranceClauses1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InsuranceClauses1Code> {
		@Override
		public InsuranceClauses1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InsuranceClauses1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}