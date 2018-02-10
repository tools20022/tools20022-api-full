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
import com.tools20022.repository.codeset.RedemptionCompletion1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the redemption status of the redemption order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletion1Code#RedemptionNo
 * RedemptionCompletion1Code.RedemptionNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletion1Code#RedemptionYes
 * RedemptionCompletion1Code.RedemptionYes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletionCode
 * RedemptionCompletionCode}</li>
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
 * "RedemptionCompletion1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the redemption status of the redemption order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RedemptionCompletion1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletion1Code
	 * RedemptionCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionNo"</li>
	 * </ul>
	 */
	public static final RedemptionCompletion1Code RedemptionNo = new RedemptionCompletion1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionNo";
			owner_lazy = () -> com.tools20022.repository.codeset.RedemptionCompletion1Code.mmObject();
			codeName = RedemptionCompletionCode.RedemptionNo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletion1Code
	 * RedemptionCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionYes"</li>
	 * </ul>
	 */
	public static final RedemptionCompletion1Code RedemptionYes = new RedemptionCompletion1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionYes";
			owner_lazy = () -> com.tools20022.repository.codeset.RedemptionCompletion1Code.mmObject();
			codeName = RedemptionCompletionCode.RedemptionYes.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RedemptionCompletion1Code> codesByName = new LinkedHashMap<>();

	protected RedemptionCompletion1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionCompletion1Code";
				definition = "Specifies the redemption status of the redemption order.";
				trace_lazy = () -> RedemptionCompletionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RedemptionCompletion1Code.RedemptionNo, com.tools20022.repository.codeset.RedemptionCompletion1Code.RedemptionYes);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RedemptionNo.getCodeName().get(), RedemptionNo);
		codesByName.put(RedemptionYes.getCodeName().get(), RedemptionYes);
	}

	public static RedemptionCompletion1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RedemptionCompletion1Code[] values() {
		RedemptionCompletion1Code[] values = new RedemptionCompletion1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RedemptionCompletion1Code> {
		@Override
		public RedemptionCompletion1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RedemptionCompletion1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}