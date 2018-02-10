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
import com.tools20022.repository.codeset.AwaitingAffirmationReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction has an awaiting affirmation status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AwaitingAffirmationReasonCode#AwaitingAffirmation
 * AwaitingAffirmationReasonCode.AwaitingAffirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AwaitingAffirmationReason1Code
 * AwaitingAffirmationReason1Code}</li>
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
 * <li>"WAFF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AwaitingAffirmationReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction has an awaiting affirmation status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AwaitingAffirmationReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Affirmation has not been received yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AwaitingAffirmationReasonCode
	 * AwaitingAffirmationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WAFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingAffirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Affirmation has not been received yet."</li>
	 * </ul>
	 */
	public static final AwaitingAffirmationReasonCode AwaitingAffirmation = new AwaitingAffirmationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingAffirmation";
			definition = "Affirmation has not been received yet.";
			owner_lazy = () -> com.tools20022.repository.codeset.AwaitingAffirmationReasonCode.mmObject();
			codeName = "WAFF";
		}
	};
	final static private LinkedHashMap<String, AwaitingAffirmationReasonCode> codesByName = new LinkedHashMap<>();

	protected AwaitingAffirmationReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WAFF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AwaitingAffirmationReasonCode";
				definition = "Specifies the reason why the instruction has an awaiting affirmation status.";
				derivation_lazy = () -> Arrays.asList(AwaitingAffirmationReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AwaitingAffirmationReasonCode.AwaitingAffirmation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingAffirmation.getCodeName().get(), AwaitingAffirmation);
	}

	public static AwaitingAffirmationReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AwaitingAffirmationReasonCode[] values() {
		AwaitingAffirmationReasonCode[] values = new AwaitingAffirmationReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AwaitingAffirmationReasonCode> {
		@Override
		public AwaitingAffirmationReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AwaitingAffirmationReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}