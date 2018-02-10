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
import com.tools20022.repository.codeset.InstructionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the action that the TSU must take on a baseline or a data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionTypeCode#Lodge
 * InstructionTypeCode.Lodge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode#FullPushThrough
 * InstructionTypeCode.FullPushThrough}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode#TwinSubmit
 * InstructionTypeCode.TwinSubmit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode#TwinResubmit
 * InstructionTypeCode.TwinResubmit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionTypeCode#Match
 * InstructionTypeCode.Match}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode#PreMatch
 * InstructionTypeCode.PreMatch}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionType3Code
 * InstructionType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionType1Code
 * InstructionType1Code}</li>
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
 * <li>"LODG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the action that the TSU must take on a baseline or a data set."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction to lodge a baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode
	 * InstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LODG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lodge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction to lodge a baseline."</li>
	 * </ul>
	 */
	public static final InstructionTypeCode Lodge = new InstructionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lodge";
			definition = "Instruction to lodge a baseline.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionTypeCode.mmObject();
			codeName = "LODG";
		}
	};
	/**
	 * Instruction to push full baseline information to the correspondent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode
	 * InstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FPTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPushThrough"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to push full baseline information to the correspondent."</li>
	 * </ul>
	 */
	public static final InstructionTypeCode FullPushThrough = new InstructionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPushThrough";
			definition = "Instruction to push full baseline information to the correspondent.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionTypeCode.mmObject();
			codeName = "FPTR";
		}
	};
	/**
	 * Indication that a twin baseline is submitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode
	 * InstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TWSB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwinSubmit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication that a twin baseline is submitted."</li>
	 * </ul>
	 */
	public static final InstructionTypeCode TwinSubmit = new InstructionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwinSubmit";
			definition = "Indication that a twin baseline is submitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionTypeCode.mmObject();
			codeName = "TWSB";
		}
	};
	/**
	 * Indication that a twin baseline is resubmitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode
	 * InstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TWRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwinResubmit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication that a twin baseline is resubmitted."</li>
	 * </ul>
	 */
	public static final InstructionTypeCode TwinResubmit = new InstructionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwinResubmit";
			definition = "Indication that a twin baseline is resubmitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionTypeCode.mmObject();
			codeName = "TWRS";
		}
	};
	/**
	 * Instruction to match a data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode
	 * InstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Match"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction to match a data set."</li>
	 * </ul>
	 */
	public static final InstructionTypeCode Match = new InstructionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Match";
			definition = "Instruction to match a data set.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionTypeCode.mmObject();
			codeName = "MTCH";
		}
	};
	/**
	 * Instruction to pre-match a data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionTypeCode
	 * InstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PMTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction to pre-match a data set."</li>
	 * </ul>
	 */
	public static final InstructionTypeCode PreMatch = new InstructionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreMatch";
			definition = "Instruction to pre-match a data set.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionTypeCode.mmObject();
			codeName = "PMTC";
		}
	};
	final static private LinkedHashMap<String, InstructionTypeCode> codesByName = new LinkedHashMap<>();

	protected InstructionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LODG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionTypeCode";
				definition = "Specifies the action that the TSU must take on a baseline or a data set.";
				derivation_lazy = () -> Arrays.asList(InstructionType3Code.mmObject(), InstructionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionTypeCode.Lodge, com.tools20022.repository.codeset.InstructionTypeCode.FullPushThrough,
						com.tools20022.repository.codeset.InstructionTypeCode.TwinSubmit, com.tools20022.repository.codeset.InstructionTypeCode.TwinResubmit, com.tools20022.repository.codeset.InstructionTypeCode.Match,
						com.tools20022.repository.codeset.InstructionTypeCode.PreMatch);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Lodge.getCodeName().get(), Lodge);
		codesByName.put(FullPushThrough.getCodeName().get(), FullPushThrough);
		codesByName.put(TwinSubmit.getCodeName().get(), TwinSubmit);
		codesByName.put(TwinResubmit.getCodeName().get(), TwinResubmit);
		codesByName.put(Match.getCodeName().get(), Match);
		codesByName.put(PreMatch.getCodeName().get(), PreMatch);
	}

	public static InstructionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionTypeCode[] values() {
		InstructionTypeCode[] values = new InstructionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionTypeCode> {
		@Override
		public InstructionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}