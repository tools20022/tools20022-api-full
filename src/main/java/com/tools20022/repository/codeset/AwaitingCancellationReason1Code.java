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
import com.tools20022.repository.codeset.AwaitingCancellationReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction has an awaiting cancellation status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AwaitingCancellationReason1Code#AwaitingCancellation
 * AwaitingCancellationReason1Code.AwaitingCancellation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AwaitingCancellationReasonCode
 * AwaitingCancellationReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"WCAN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AwaitingCancellationReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction has an awaiting cancellation status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AwaitingCancellationReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AwaitingCancellationReason1Code
	 * AwaitingCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCancellation"</li>
	 * </ul>
	 */
	public static final AwaitingCancellationReason1Code AwaitingCancellation = new AwaitingCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.AwaitingCancellationReason1Code.mmObject();
			codeName = AwaitingCancellationReasonCode.AwaitingCancellation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AwaitingCancellationReason1Code> codesByName = new LinkedHashMap<>();

	protected AwaitingCancellationReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WCAN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AwaitingCancellationReason1Code";
				definition = "Specifies the reason why the instruction has an awaiting cancellation status.";
				trace_lazy = () -> AwaitingCancellationReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AwaitingCancellationReason1Code.AwaitingCancellation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingCancellation.getCodeName().get(), AwaitingCancellation);
	}

	public static AwaitingCancellationReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AwaitingCancellationReason1Code[] values() {
		AwaitingCancellationReason1Code[] values = new AwaitingCancellationReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AwaitingCancellationReason1Code> {
		@Override
		public AwaitingCancellationReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AwaitingCancellationReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}