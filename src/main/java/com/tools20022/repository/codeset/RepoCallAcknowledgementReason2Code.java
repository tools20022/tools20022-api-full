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
import com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies additional information about the repurchase agreement call
 * processed instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code#InProcess
 * RepoCallAcknowledgementReason2Code.InProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code#Processed
 * RepoCallAcknowledgementReason2Code.Processed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code#AccountServicerDeadlineMissed
 * RepoCallAcknowledgementReason2Code.AccountServicerDeadlineMissed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReasonCode
 * RepoCallAcknowledgementReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CALD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepoCallAcknowledgementReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional information about the repurchase agreement call processed instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepoCallAcknowledgementReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code
	 * RepoCallAcknowledgementReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InProcess"</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReason2Code InProcess = new RepoCallAcknowledgementReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code.mmObject();
			codeName = RepoCallAcknowledgementReasonCode.InProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code
	 * RepoCallAcknowledgementReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Processed"</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReason2Code Processed = new RepoCallAcknowledgementReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processed";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code.mmObject();
			codeName = RepoCallAcknowledgementReasonCode.Processed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code
	 * RepoCallAcknowledgementReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReason2Code AccountServicerDeadlineMissed = new RepoCallAcknowledgementReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code.mmObject();
			codeName = RepoCallAcknowledgementReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RepoCallAcknowledgementReason2Code> codesByName = new LinkedHashMap<>();

	protected RepoCallAcknowledgementReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CALD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepoCallAcknowledgementReason2Code";
				definition = "Specifies additional information about the repurchase agreement call processed instruction.";
				trace_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code.InProcess, com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code.Processed,
						com.tools20022.repository.codeset.RepoCallAcknowledgementReason2Code.AccountServicerDeadlineMissed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InProcess.getCodeName().get(), InProcess);
		codesByName.put(Processed.getCodeName().get(), Processed);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
	}

	public static RepoCallAcknowledgementReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepoCallAcknowledgementReason2Code[] values() {
		RepoCallAcknowledgementReason2Code[] values = new RepoCallAcknowledgementReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepoCallAcknowledgementReason2Code> {
		@Override
		public RepoCallAcknowledgementReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepoCallAcknowledgementReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}