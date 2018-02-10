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
import com.tools20022.repository.codeset.VoteInstruction1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the possible types of voting instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.VoteInstruction1Code#For
 * VoteInstruction1Code.For}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code#Against
 * VoteInstruction1Code.Against}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code#Abstain
 * VoteInstruction1Code.Abstain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code#Withhold
 * VoteInstruction1Code.Withhold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code#NoAction
 * VoteInstruction1Code.NoAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.VoteInstructionCode
 * VoteInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CFOR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VoteInstruction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the possible types of voting instructions."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class VoteInstruction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code
	 * VoteInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "For"</li>
	 * </ul>
	 */
	public static final VoteInstruction1Code For = new VoteInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "For";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction1Code.mmObject();
			codeName = VoteInstructionCode.For.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code
	 * VoteInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Against"</li>
	 * </ul>
	 */
	public static final VoteInstruction1Code Against = new VoteInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Against";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction1Code.mmObject();
			codeName = VoteInstructionCode.Against.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code
	 * VoteInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * </ul>
	 */
	public static final VoteInstruction1Code Abstain = new VoteInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Abstain";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction1Code.mmObject();
			codeName = VoteInstructionCode.Abstain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code
	 * VoteInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withhold"</li>
	 * </ul>
	 */
	public static final VoteInstruction1Code Withhold = new VoteInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withhold";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction1Code.mmObject();
			codeName = VoteInstructionCode.Withhold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code
	 * VoteInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * </ul>
	 */
	public static final VoteInstruction1Code NoAction = new VoteInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction1Code.mmObject();
			codeName = VoteInstructionCode.NoAction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, VoteInstruction1Code> codesByName = new LinkedHashMap<>();

	protected VoteInstruction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CFOR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteInstruction1Code";
				definition = "Identifies the possible types of voting instructions.";
				trace_lazy = () -> VoteInstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.VoteInstruction1Code.For, com.tools20022.repository.codeset.VoteInstruction1Code.Against, com.tools20022.repository.codeset.VoteInstruction1Code.Abstain,
						com.tools20022.repository.codeset.VoteInstruction1Code.Withhold, com.tools20022.repository.codeset.VoteInstruction1Code.NoAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(For.getCodeName().get(), For);
		codesByName.put(Against.getCodeName().get(), Against);
		codesByName.put(Abstain.getCodeName().get(), Abstain);
		codesByName.put(Withhold.getCodeName().get(), Withhold);
		codesByName.put(NoAction.getCodeName().get(), NoAction);
	}

	public static VoteInstruction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static VoteInstruction1Code[] values() {
		VoteInstruction1Code[] values = new VoteInstruction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, VoteInstruction1Code> {
		@Override
		public VoteInstruction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(VoteInstruction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}