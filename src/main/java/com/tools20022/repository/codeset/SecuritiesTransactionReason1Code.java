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
import com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the reason why the transaction has a specific status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code#Cancellation
 * SecuritiesTransactionReason1Code.Cancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code#PendingCancellation
 * SecuritiesTransactionReason1Code.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code#Generated
 * SecuritiesTransactionReason1Code.Generated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code#Unmatched
 * SecuritiesTransactionReason1Code.Unmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code#Acknowledgement
 * SecuritiesTransactionReason1Code.Acknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code#Pending
 * SecuritiesTransactionReason1Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code#Failing
 * SecuritiesTransactionReason1Code.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code#PendingProcessing
 * SecuritiesTransactionReason1Code.PendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code#Repair
 * SecuritiesTransactionReason1Code.Repair}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
 * SecuritiesTransactionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the reason why the transaction has a specific status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
	 * SecuritiesTransactionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReason1Code Cancellation = new SecuritiesTransactionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.mmObject();
			codeName = SecuritiesTransactionReasonCode.Cancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
	 * SecuritiesTransactionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReason1Code PendingCancellation = new SecuritiesTransactionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.mmObject();
			codeName = SecuritiesTransactionReasonCode.PendingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
	 * SecuritiesTransactionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Generated"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReason1Code Generated = new SecuritiesTransactionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.mmObject();
			codeName = SecuritiesTransactionReasonCode.Generated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
	 * SecuritiesTransactionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReason1Code Unmatched = new SecuritiesTransactionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.mmObject();
			codeName = SecuritiesTransactionReasonCode.Unmatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
	 * SecuritiesTransactionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acknowledgement"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReason1Code Acknowledgement = new SecuritiesTransactionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acknowledgement";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.mmObject();
			codeName = SecuritiesTransactionReasonCode.Acknowledgement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
	 * SecuritiesTransactionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReason1Code Pending = new SecuritiesTransactionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.mmObject();
			codeName = SecuritiesTransactionReasonCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
	 * SecuritiesTransactionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Failing"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReason1Code Failing = new SecuritiesTransactionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Failing";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.mmObject();
			codeName = SecuritiesTransactionReasonCode.Failing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
	 * SecuritiesTransactionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReason1Code PendingProcessing = new SecuritiesTransactionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.mmObject();
			codeName = SecuritiesTransactionReasonCode.PendingProcessing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
	 * SecuritiesTransactionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repair"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReason1Code Repair = new SecuritiesTransactionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repair";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.mmObject();
			codeName = SecuritiesTransactionReasonCode.Repair.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionReason1Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionReason1Code";
				definition = "Identifies the reason why the transaction has a specific status.";
				trace_lazy = () -> SecuritiesTransactionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.Cancellation, com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.PendingCancellation,
						com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.Generated, com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.Unmatched,
						com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.Acknowledgement, com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.Pending,
						com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.Failing, com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.PendingProcessing,
						com.tools20022.repository.codeset.SecuritiesTransactionReason1Code.Repair);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cancellation.getCodeName().get(), Cancellation);
		codesByName.put(PendingCancellation.getCodeName().get(), PendingCancellation);
		codesByName.put(Generated.getCodeName().get(), Generated);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(Acknowledgement.getCodeName().get(), Acknowledgement);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Failing.getCodeName().get(), Failing);
		codesByName.put(PendingProcessing.getCodeName().get(), PendingProcessing);
		codesByName.put(Repair.getCodeName().get(), Repair);
	}

	public static SecuritiesTransactionReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionReason1Code[] values() {
		SecuritiesTransactionReason1Code[] values = new SecuritiesTransactionReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionReason1Code> {
		@Override
		public SecuritiesTransactionReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}