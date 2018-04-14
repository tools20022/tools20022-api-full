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
import com.tools20022.repository.codeset.TransactionOperationType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the transaction operation action type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code#Correction
 * TransactionOperationType3Code.Correction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code#EarlyTermination
 * TransactionOperationType3Code.EarlyTermination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code#Error
 * TransactionOperationType3Code.Error}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code#NewTransaction
 * TransactionOperationType3Code.NewTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code#PositionComponent
 * TransactionOperationType3Code.PositionComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code#ValuationUpdate
 * TransactionOperationType3Code.ValuationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code#Compression
 * TransactionOperationType3Code.Compression}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code#Modification
 * TransactionOperationType3Code.Modification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code#Other
 * TransactionOperationType3Code.Other}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionOperationType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the transaction operation action type."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionOperationType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Correction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TransactionOperationType3Code Correction = new TransactionOperationType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Correction";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType3Code.mmObject();
			codeName = TransactionOperationTypeCode.Correction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyTermination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TransactionOperationType3Code EarlyTermination = new TransactionOperationType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyTermination";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType3Code.mmObject();
			codeName = TransactionOperationTypeCode.EarlyTermination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Error"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TransactionOperationType3Code Error = new TransactionOperationType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Error";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType3Code.mmObject();
			codeName = TransactionOperationTypeCode.Error.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TransactionOperationType3Code NewTransaction = new TransactionOperationType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType3Code.mmObject();
			codeName = TransactionOperationTypeCode.NewTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TransactionOperationType3Code PositionComponent = new TransactionOperationType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionComponent";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType3Code.mmObject();
			codeName = TransactionOperationTypeCode.PositionComponent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TransactionOperationType3Code ValuationUpdate = new TransactionOperationType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationUpdate";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType3Code.mmObject();
			codeName = TransactionOperationTypeCode.ValuationUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compression"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TransactionOperationType3Code Compression = new TransactionOperationType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compression";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType3Code.mmObject();
			codeName = TransactionOperationTypeCode.Compression.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TransactionOperationType3Code Modification = new TransactionOperationType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType3Code.mmObject();
			codeName = TransactionOperationTypeCode.Modification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType3Code
	 * TransactionOperationType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TransactionOperationType3Code Other = new TransactionOperationType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionOperationType3Code.mmObject();
			codeName = TransactionOperationTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionOperationType3Code> codesByName = new LinkedHashMap<>();

	protected TransactionOperationType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionOperationType3Code";
				definition = "Specifies the transaction operation action type.";
				trace_lazy = () -> TransactionOperationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionOperationType3Code.Correction, com.tools20022.repository.codeset.TransactionOperationType3Code.EarlyTermination,
						com.tools20022.repository.codeset.TransactionOperationType3Code.Error, com.tools20022.repository.codeset.TransactionOperationType3Code.NewTransaction,
						com.tools20022.repository.codeset.TransactionOperationType3Code.PositionComponent, com.tools20022.repository.codeset.TransactionOperationType3Code.ValuationUpdate,
						com.tools20022.repository.codeset.TransactionOperationType3Code.Compression, com.tools20022.repository.codeset.TransactionOperationType3Code.Modification,
						com.tools20022.repository.codeset.TransactionOperationType3Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Correction.getCodeName().get(), Correction);
		codesByName.put(EarlyTermination.getCodeName().get(), EarlyTermination);
		codesByName.put(Error.getCodeName().get(), Error);
		codesByName.put(NewTransaction.getCodeName().get(), NewTransaction);
		codesByName.put(PositionComponent.getCodeName().get(), PositionComponent);
		codesByName.put(ValuationUpdate.getCodeName().get(), ValuationUpdate);
		codesByName.put(Compression.getCodeName().get(), Compression);
		codesByName.put(Modification.getCodeName().get(), Modification);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static TransactionOperationType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionOperationType3Code[] values() {
		TransactionOperationType3Code[] values = new TransactionOperationType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionOperationType3Code> {
		@Override
		public TransactionOperationType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionOperationType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}