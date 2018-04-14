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
import com.tools20022.repository.codeset.DepositaryReceiptProcessingStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a depositary receipt processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DepositaryReceiptProcessingStatus1Code#NoRecordFound
 * DepositaryReceiptProcessingStatus1Code.NoRecordFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DepositaryReceiptProcessingStatus1Code#Pending
 * DepositaryReceiptProcessingStatus1Code.Pending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DepositaryReceiptProcessingStatusCode
 * DepositaryReceiptProcessingStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DepositaryReceiptProcessingStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a depositary receipt processing."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NORE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DepositaryReceiptProcessingStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DepositaryReceiptProcessingStatus1Code
	 * DepositaryReceiptProcessingStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRecordFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DepositaryReceiptProcessingStatus1Code NoRecordFound = new DepositaryReceiptProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRecordFound";
			owner_lazy = () -> com.tools20022.repository.codeset.DepositaryReceiptProcessingStatus1Code.mmObject();
			codeName = DepositaryReceiptProcessingStatusCode.NoRecordFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DepositaryReceiptProcessingStatus1Code
	 * DepositaryReceiptProcessingStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DepositaryReceiptProcessingStatus1Code Pending = new DepositaryReceiptProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.DepositaryReceiptProcessingStatus1Code.mmObject();
			codeName = DepositaryReceiptProcessingStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DepositaryReceiptProcessingStatus1Code> codesByName = new LinkedHashMap<>();

	protected DepositaryReceiptProcessingStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NORE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DepositaryReceiptProcessingStatus1Code";
				definition = "Specifies the status of a depositary receipt processing.";
				trace_lazy = () -> DepositaryReceiptProcessingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DepositaryReceiptProcessingStatus1Code.NoRecordFound, com.tools20022.repository.codeset.DepositaryReceiptProcessingStatus1Code.Pending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoRecordFound.getCodeName().get(), NoRecordFound);
		codesByName.put(Pending.getCodeName().get(), Pending);
	}

	public static DepositaryReceiptProcessingStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DepositaryReceiptProcessingStatus1Code[] values() {
		DepositaryReceiptProcessingStatus1Code[] values = new DepositaryReceiptProcessingStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DepositaryReceiptProcessingStatus1Code> {
		@Override
		public DepositaryReceiptProcessingStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DepositaryReceiptProcessingStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}