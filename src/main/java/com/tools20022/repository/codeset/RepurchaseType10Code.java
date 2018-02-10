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
import com.tools20022.repository.codeset.RepurchaseType10Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of repurchase transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code#Pairoff
 * RepurchaseType10Code.Pairoff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code#RepoContractRollover
 * RepurchaseType10Code.RepoContractRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code#RepoRate
 * RepurchaseType10Code.RepoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code#RepurchaseCall
 * RepurchaseType10Code.RepurchaseCall}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseType10Code#Swap
 * RepurchaseType10Code.Swap}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepurchaseType10Code#TopUp
 * RepurchaseType10Code.TopUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code#Withdrawal
 * RepurchaseType10Code.Withdrawal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
 * RepurchaseTypeV2Code}</li>
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
 * "RepurchaseType10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of repurchase transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepurchaseType10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code
	 * RepurchaseType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pairoff"</li>
	 * </ul>
	 */
	public static final RepurchaseType10Code Pairoff = new RepurchaseType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType10Code.mmObject();
			codeName = RepurchaseTypeV2Code.Pairoff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code
	 * RepurchaseType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoContractRollover"</li>
	 * </ul>
	 */
	public static final RepurchaseType10Code RepoContractRollover = new RepurchaseType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoContractRollover";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType10Code.mmObject();
			codeName = RepurchaseTypeV2Code.RepoContractRollover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code
	 * RepurchaseType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoRate"</li>
	 * </ul>
	 */
	public static final RepurchaseType10Code RepoRate = new RepurchaseType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType10Code.mmObject();
			codeName = RepurchaseTypeV2Code.RepoRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code
	 * RepurchaseType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCall"</li>
	 * </ul>
	 */
	public static final RepurchaseType10Code RepurchaseCall = new RepurchaseType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCall";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType10Code.mmObject();
			codeName = RepurchaseTypeV2Code.RepurchaseCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code
	 * RepurchaseType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * </ul>
	 */
	public static final RepurchaseType10Code Swap = new RepurchaseType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType10Code.mmObject();
			codeName = RepurchaseTypeV2Code.Swap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code
	 * RepurchaseType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUp"</li>
	 * </ul>
	 */
	public static final RepurchaseType10Code TopUp = new RepurchaseType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUp";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType10Code.mmObject();
			codeName = RepurchaseTypeV2Code.TopUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType10Code
	 * RepurchaseType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * </ul>
	 */
	public static final RepurchaseType10Code Withdrawal = new RepurchaseType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType10Code.mmObject();
			codeName = RepurchaseTypeV2Code.Withdrawal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RepurchaseType10Code> codesByName = new LinkedHashMap<>();

	protected RepurchaseType10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepurchaseType10Code";
				definition = "Specifies the type of repurchase transaction.";
				trace_lazy = () -> RepurchaseTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepurchaseType10Code.Pairoff, com.tools20022.repository.codeset.RepurchaseType10Code.RepoContractRollover,
						com.tools20022.repository.codeset.RepurchaseType10Code.RepoRate, com.tools20022.repository.codeset.RepurchaseType10Code.RepurchaseCall, com.tools20022.repository.codeset.RepurchaseType10Code.Swap,
						com.tools20022.repository.codeset.RepurchaseType10Code.TopUp, com.tools20022.repository.codeset.RepurchaseType10Code.Withdrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Pairoff.getCodeName().get(), Pairoff);
		codesByName.put(RepoContractRollover.getCodeName().get(), RepoContractRollover);
		codesByName.put(RepoRate.getCodeName().get(), RepoRate);
		codesByName.put(RepurchaseCall.getCodeName().get(), RepurchaseCall);
		codesByName.put(Swap.getCodeName().get(), Swap);
		codesByName.put(TopUp.getCodeName().get(), TopUp);
		codesByName.put(Withdrawal.getCodeName().get(), Withdrawal);
	}

	public static RepurchaseType10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepurchaseType10Code[] values() {
		RepurchaseType10Code[] values = new RepurchaseType10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepurchaseType10Code> {
		@Override
		public RepurchaseType10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepurchaseType10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}