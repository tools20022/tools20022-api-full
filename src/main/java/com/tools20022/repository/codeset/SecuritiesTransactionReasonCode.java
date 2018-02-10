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
import com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode#Cancellation
 * SecuritiesTransactionReasonCode.Cancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode#PendingCancellation
 * SecuritiesTransactionReasonCode.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode#Generated
 * SecuritiesTransactionReasonCode.Generated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode#Unmatched
 * SecuritiesTransactionReasonCode.Unmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode#Acknowledgement
 * SecuritiesTransactionReasonCode.Acknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode#Pending
 * SecuritiesTransactionReasonCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode#Failing
 * SecuritiesTransactionReasonCode.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode#PendingProcessing
 * SecuritiesTransactionReasonCode.PendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode#Repair
 * SecuritiesTransactionReasonCode.Repair}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReason1Code
 * SecuritiesTransactionReason1Code}</li>
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
 * <li>"CAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the reason why the transaction has a specific status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reason why the instruction is cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
	 * SecuritiesTransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the instruction is cancelled."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReasonCode Cancellation = new SecuritiesTransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Specifies the reason why the instruction is cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Specifies the reason why a cancellation request sent for the related
	 * instruction is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
	 * SecuritiesTransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why a cancellation request sent for the related instruction is pending."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReasonCode PendingCancellation = new SecuritiesTransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Specifies the reason why a cancellation request sent for the related instruction is pending.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Specifies the reason why the transaction was generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
	 * SecuritiesTransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Generated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the transaction was generated."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReasonCode Generated = new SecuritiesTransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			definition = "Specifies the reason why the transaction was generated.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.mmObject();
			codeName = "CGEN";
		}
	};
	/**
	 * Specifies the reason why the instruction has an unmatched status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
	 * SecuritiesTransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has an unmatched status."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReasonCode Unmatched = new SecuritiesTransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Specifies the reason why the instruction has an unmatched status.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Specifies additional information about the processed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
	 * SecuritiesTransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReasonCode Acknowledgement = new SecuritiesTransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acknowledgement";
			definition = "Specifies additional information about the processed instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Specifies the reason why the instruction has a pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
	 * SecuritiesTransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a pending status."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReasonCode Pending = new SecuritiesTransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Specifies the reason why the instruction has a pending status.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Specifies the reason why the instruction has a failing settlement status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
	 * SecuritiesTransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Failing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a failing settlement status."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReasonCode Failing = new SecuritiesTransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Failing";
			definition = "Specifies the reason why the instruction has a failing settlement status.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.mmObject();
			codeName = "PENF";
		}
	};
	/**
	 * Specifies the reason why the instruction has a pending processing status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
	 * SecuritiesTransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a pending processing status."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReasonCode PendingProcessing = new SecuritiesTransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			definition = "Specifies the reason why the instruction has a pending processing status.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.mmObject();
			codeName = "PPRC";
		}
	};
	/**
	 * Specifies the reason why the instruction is in repair.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionReasonCode
	 * SecuritiesTransactionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repair"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the instruction is in repair."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionReasonCode Repair = new SecuritiesTransactionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repair";
			definition = "Specifies the reason why the instruction is in repair.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.mmObject();
			codeName = "REPR";
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionReasonCode> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionReasonCode";
				definition = "Identifies the reason why the transaction has a specific status.";
				derivation_lazy = () -> Arrays.asList(SecuritiesTransactionReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.Cancellation, com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.PendingCancellation,
						com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.Generated, com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.Unmatched,
						com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.Acknowledgement, com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.Pending,
						com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.Failing, com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.PendingProcessing,
						com.tools20022.repository.codeset.SecuritiesTransactionReasonCode.Repair);
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

	public static SecuritiesTransactionReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionReasonCode[] values() {
		SecuritiesTransactionReasonCode[] values = new SecuritiesTransactionReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionReasonCode> {
		@Override
		public SecuritiesTransactionReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}