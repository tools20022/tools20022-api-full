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
import com.tools20022.repository.codeset.RedemptionCompletionCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletionCode#RedemptionYes
 * RedemptionCompletionCode.RedemptionYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletionCode#RedemptionNo
 * RedemptionCompletionCode.RedemptionNo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RedemptionCompletion1Code
 * RedemptionCompletion1Code}</li>
 * </ul>
 * </li>
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
 * "RedemptionCompletionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the redemption status of the redemption order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RedemptionCompletionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Additional redemption order instructions must be sent to the executing
	 * party order to have the rest of the redemption executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletionCode
	 * RedemptionCompletionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RED1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionYes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional redemption order instructions must be sent to the executing party order to have the rest of the redemption executed."
	 * </li>
	 * </ul>
	 */
	public static final RedemptionCompletionCode RedemptionYes = new RedemptionCompletionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionYes";
			definition = "Additional redemption order instructions must be sent to the executing party order to have the rest of the redemption executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RedemptionCompletionCode.mmObject();
			codeName = "RED1";
		}
	};
	/**
	 * It is not necessary to send more redemption order instructions to the
	 * executing party to complete the redemption, the executing will generate
	 * redemption confirmations automatically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletionCode
	 * RedemptionCompletionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RED0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionNo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is not necessary to send more redemption order instructions to the executing party to complete the redemption, the executing will generate redemption confirmations automatically."
	 * </li>
	 * </ul>
	 */
	public static final RedemptionCompletionCode RedemptionNo = new RedemptionCompletionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionNo";
			definition = "It is not necessary to send more redemption order instructions to the executing party to complete the redemption, the executing will generate redemption confirmations automatically.";
			owner_lazy = () -> com.tools20022.repository.codeset.RedemptionCompletionCode.mmObject();
			codeName = "RED0";
		}
	};
	final static private LinkedHashMap<String, RedemptionCompletionCode> codesByName = new LinkedHashMap<>();

	protected RedemptionCompletionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionCompletionCode";
				definition = "Specifies the redemption status of the redemption order.";
				derivation_lazy = () -> Arrays.asList(RedemptionCompletion1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RedemptionCompletionCode.RedemptionYes, com.tools20022.repository.codeset.RedemptionCompletionCode.RedemptionNo);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RedemptionYes.getCodeName().get(), RedemptionYes);
		codesByName.put(RedemptionNo.getCodeName().get(), RedemptionNo);
	}

	public static RedemptionCompletionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RedemptionCompletionCode[] values() {
		RedemptionCompletionCode[] values = new RedemptionCompletionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RedemptionCompletionCode> {
		@Override
		public RedemptionCompletionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RedemptionCompletionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}