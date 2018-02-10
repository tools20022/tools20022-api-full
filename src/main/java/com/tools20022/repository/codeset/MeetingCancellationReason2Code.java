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
import com.tools20022.repository.codeset.MeetingCancellationReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for cancelling a meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReason2Code#Quorum
 * MeetingCancellationReason2Code.Quorum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReason2Code#Processing
 * MeetingCancellationReason2Code.Processing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReason2Code#Withdrawal
 * MeetingCancellationReason2Code.Withdrawal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReasonCode
 * MeetingCancellationReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"QORM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingCancellationReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for cancelling a meeting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingCancellationReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReason2Code
	 * MeetingCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quorum"</li>
	 * </ul>
	 */
	public static final MeetingCancellationReason2Code Quorum = new MeetingCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quorum";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingCancellationReason2Code.mmObject();
			codeName = MeetingCancellationReasonCode.Quorum.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReason2Code
	 * MeetingCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Processing"</li>
	 * </ul>
	 */
	public static final MeetingCancellationReason2Code Processing = new MeetingCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processing";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingCancellationReason2Code.mmObject();
			codeName = MeetingCancellationReasonCode.Processing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingCancellationReason2Code
	 * MeetingCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * </ul>
	 */
	public static final MeetingCancellationReason2Code Withdrawal = new MeetingCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingCancellationReason2Code.mmObject();
			codeName = MeetingCancellationReasonCode.Withdrawal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MeetingCancellationReason2Code> codesByName = new LinkedHashMap<>();

	protected MeetingCancellationReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("QORM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingCancellationReason2Code";
				definition = "Specifies the reason for cancelling a meeting.";
				trace_lazy = () -> MeetingCancellationReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingCancellationReason2Code.Quorum, com.tools20022.repository.codeset.MeetingCancellationReason2Code.Processing,
						com.tools20022.repository.codeset.MeetingCancellationReason2Code.Withdrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Quorum.getCodeName().get(), Quorum);
		codesByName.put(Processing.getCodeName().get(), Processing);
		codesByName.put(Withdrawal.getCodeName().get(), Withdrawal);
	}

	public static MeetingCancellationReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingCancellationReason2Code[] values() {
		MeetingCancellationReason2Code[] values = new MeetingCancellationReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingCancellationReason2Code> {
		@Override
		public MeetingCancellationReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingCancellationReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}