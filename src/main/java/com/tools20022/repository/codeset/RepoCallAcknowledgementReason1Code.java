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
import com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies additional information about the repurchase agreement call
 * processed instruction
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code#AccountServicerDeadlineMissed
 * RepoCallAcknowledgementReason1Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code#InProcess
 * RepoCallAcknowledgementReason1Code.InProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code#Issued
 * RepoCallAcknowledgementReason1Code.Issued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code#Processed
 * RepoCallAcknowledgementReason1Code.Processed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code#BeingProcessed
 * RepoCallAcknowledgementReason1Code.BeingProcessed}</li>
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
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepoCallAcknowledgementReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional information about the repurchase agreement call processed instruction"
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepoCallAcknowledgementReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code
	 * RepoCallAcknowledgementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReason1Code AccountServicerDeadlineMissed = new RepoCallAcknowledgementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.mmObject();
			codeName = RepoCallAcknowledgementReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code
	 * RepoCallAcknowledgementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InProcess"</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReason1Code InProcess = new RepoCallAcknowledgementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.mmObject();
			codeName = RepoCallAcknowledgementReasonCode.InProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code
	 * RepoCallAcknowledgementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReason1Code Issued = new RepoCallAcknowledgementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.mmObject();
			codeName = RepoCallAcknowledgementReasonCode.Issued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code
	 * RepoCallAcknowledgementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Processed"</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReason1Code Processed = new RepoCallAcknowledgementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processed";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.mmObject();
			codeName = RepoCallAcknowledgementReasonCode.Processed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code
	 * RepoCallAcknowledgementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingProcessed"</li>
	 * </ul>
	 */
	public static final RepoCallAcknowledgementReason1Code BeingProcessed = new RepoCallAcknowledgementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.mmObject();
			codeName = RepoCallAcknowledgementReasonCode.BeingProcessed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RepoCallAcknowledgementReason1Code> codesByName = new LinkedHashMap<>();

	protected RepoCallAcknowledgementReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepoCallAcknowledgementReason1Code";
				definition = "Specifies additional information about the repurchase agreement call processed instruction";
				trace_lazy = () -> RepoCallAcknowledgementReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.InProcess,
						com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.Issued, com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.Processed,
						com.tools20022.repository.codeset.RepoCallAcknowledgementReason1Code.BeingProcessed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(InProcess.getCodeName().get(), InProcess);
		codesByName.put(Issued.getCodeName().get(), Issued);
		codesByName.put(Processed.getCodeName().get(), Processed);
		codesByName.put(BeingProcessed.getCodeName().get(), BeingProcessed);
	}

	public static RepoCallAcknowledgementReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepoCallAcknowledgementReason1Code[] values() {
		RepoCallAcknowledgementReason1Code[] values = new RepoCallAcknowledgementReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepoCallAcknowledgementReason1Code> {
		@Override
		public RepoCallAcknowledgementReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepoCallAcknowledgementReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}