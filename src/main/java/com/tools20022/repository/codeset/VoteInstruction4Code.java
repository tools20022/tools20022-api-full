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
import com.tools20022.repository.codeset.VoteInstruction4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the possible types of voting instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#Abstain
 * VoteInstruction4Code.Abstain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#Against
 * VoteInstruction4Code.Against}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#AgainstManagement
 * VoteInstruction4Code.AgainstManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#Chairman
 * VoteInstruction4Code.Chairman}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#For
 * VoteInstruction4Code.For}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#NoAction
 * VoteInstruction4Code.NoAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#Withhold
 * VoteInstruction4Code.Withhold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#WithManagement
 * VoteInstruction4Code.WithManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#TwoYears
 * VoteInstruction4Code.TwoYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#ThreeYears
 * VoteInstruction4Code.ThreeYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code#OneYear
 * VoteInstruction4Code.OneYear}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VoteInstruction4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the possible types of voting instructions."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class VoteInstruction4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code Abstain = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Abstain";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.Abstain.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Against"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code Against = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Against";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.Against.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgainstManagement"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code AgainstManagement = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstManagement";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.AgainstManagement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Chairman"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code Chairman = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Chairman";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.Chairman.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "For"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code For = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "For";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.For.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code NoAction = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.NoAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withhold"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code Withhold = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withhold";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.Withhold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithManagement"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code WithManagement = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithManagement";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.WithManagement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoYears"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code TwoYears = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoYears";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.TwoYears.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThreeYears"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code ThreeYears = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThreeYears";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.ThreeYears.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction4Code
	 * VoteInstruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneYear"</li>
	 * </ul>
	 */
	public static final VoteInstruction4Code OneYear = new VoteInstruction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneYear";
			owner_lazy = () -> com.tools20022.repository.codeset.VoteInstruction4Code.mmObject();
			codeName = VoteInstructionCode.OneYear.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, VoteInstruction4Code> codesByName = new LinkedHashMap<>();

	protected VoteInstruction4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteInstruction4Code";
				definition = "Specifies the possible types of voting instructions.";
				trace_lazy = () -> VoteInstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.VoteInstruction4Code.Abstain, com.tools20022.repository.codeset.VoteInstruction4Code.Against,
						com.tools20022.repository.codeset.VoteInstruction4Code.AgainstManagement, com.tools20022.repository.codeset.VoteInstruction4Code.Chairman, com.tools20022.repository.codeset.VoteInstruction4Code.For,
						com.tools20022.repository.codeset.VoteInstruction4Code.NoAction, com.tools20022.repository.codeset.VoteInstruction4Code.Withhold, com.tools20022.repository.codeset.VoteInstruction4Code.WithManagement,
						com.tools20022.repository.codeset.VoteInstruction4Code.TwoYears, com.tools20022.repository.codeset.VoteInstruction4Code.ThreeYears, com.tools20022.repository.codeset.VoteInstruction4Code.OneYear);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Abstain.getCodeName().get(), Abstain);
		codesByName.put(Against.getCodeName().get(), Against);
		codesByName.put(AgainstManagement.getCodeName().get(), AgainstManagement);
		codesByName.put(Chairman.getCodeName().get(), Chairman);
		codesByName.put(For.getCodeName().get(), For);
		codesByName.put(NoAction.getCodeName().get(), NoAction);
		codesByName.put(Withhold.getCodeName().get(), Withhold);
		codesByName.put(WithManagement.getCodeName().get(), WithManagement);
		codesByName.put(TwoYears.getCodeName().get(), TwoYears);
		codesByName.put(ThreeYears.getCodeName().get(), ThreeYears);
		codesByName.put(OneYear.getCodeName().get(), OneYear);
	}

	public static VoteInstruction4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static VoteInstruction4Code[] values() {
		VoteInstruction4Code[] values = new VoteInstruction4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, VoteInstruction4Code> {
		@Override
		public VoteInstruction4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(VoteInstruction4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}