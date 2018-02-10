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
import com.tools20022.repository.codeset.TransactionOperationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of process related to a specific transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code#Amendment
 * TransactionOperationType1Code.Amendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code#Cancellation
 * TransactionOperationType1Code.Cancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code#Correction
 * TransactionOperationType1Code.Correction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code#NewTransaction
 * TransactionOperationType1Code.NewTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationTypeCode
 * TransactionOperationTypeCode}</li>
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
 * "TransactionOperationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of process related to a specific transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionOperationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code
	 * TransactionOperationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * </ul>
	 */
	public static final TransactionOperationType1Code Amendment = new TransactionOperationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType1Code.mmObject();
			codeName = TransactionOperationTypeCode.Amendment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code
	 * TransactionOperationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * </ul>
	 */
	public static final TransactionOperationType1Code Cancellation = new TransactionOperationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType1Code.mmObject();
			codeName = TransactionOperationTypeCode.Cancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code
	 * TransactionOperationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Correction"</li>
	 * </ul>
	 */
	public static final TransactionOperationType1Code Correction = new TransactionOperationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Correction";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType1Code.mmObject();
			codeName = TransactionOperationTypeCode.Correction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code
	 * TransactionOperationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewTransaction"</li>
	 * </ul>
	 */
	public static final TransactionOperationType1Code NewTransaction = new TransactionOperationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType1Code.mmObject();
			codeName = TransactionOperationTypeCode.NewTransaction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionOperationType1Code> codesByName = new LinkedHashMap<>();

	protected TransactionOperationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionOperationType1Code";
				definition = "Specifies the type of process related to a specific transaction.";
				trace_lazy = () -> TransactionOperationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionOperationType1Code.Amendment, com.tools20022.repository.codeset.TransactionOperationType1Code.Cancellation,
						com.tools20022.repository.codeset.TransactionOperationType1Code.Correction, com.tools20022.repository.codeset.TransactionOperationType1Code.NewTransaction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Amendment.getCodeName().get(), Amendment);
		codesByName.put(Cancellation.getCodeName().get(), Cancellation);
		codesByName.put(Correction.getCodeName().get(), Correction);
		codesByName.put(NewTransaction.getCodeName().get(), NewTransaction);
	}

	public static TransactionOperationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionOperationType1Code[] values() {
		TransactionOperationType1Code[] values = new TransactionOperationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionOperationType1Code> {
		@Override
		public TransactionOperationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionOperationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}