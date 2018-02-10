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
import com.tools20022.repository.codeset.ModificationProcessingStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code#Accepted
 * ModificationProcessingStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code#Rejected
 * ModificationProcessingStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code#Completed
 * ModificationProcessingStatus1Code.Completed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code#Denied
 * ModificationProcessingStatus1Code.Denied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code#Pending
 * ModificationProcessingStatus1Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code#InRepair
 * ModificationProcessingStatus1Code.InRepair}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatusCode
 * ModificationProcessingStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PACK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModificationProcessingStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a cancellation request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ModificationProcessingStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code
	 * ModificationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatus1Code Accepted = new ModificationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatus1Code.mmObject();
			codeName = ModificationProcessingStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code
	 * ModificationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatus1Code Rejected = new ModificationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatus1Code.mmObject();
			codeName = ModificationProcessingStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code
	 * ModificationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatus1Code Completed = new ModificationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatus1Code.mmObject();
			codeName = ModificationProcessingStatusCode.Completed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code
	 * ModificationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatus1Code Denied = new ModificationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatus1Code.mmObject();
			codeName = ModificationProcessingStatusCode.Denied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code
	 * ModificationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatus1Code Pending = new ModificationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatus1Code.mmObject();
			codeName = ModificationProcessingStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ModificationProcessingStatus1Code
	 * ModificationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * </ul>
	 */
	public static final ModificationProcessingStatus1Code InRepair = new ModificationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			owner_lazy = () -> com.tools20022.repository.codeset.ModificationProcessingStatus1Code.mmObject();
			codeName = ModificationProcessingStatusCode.InRepair.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ModificationProcessingStatus1Code> codesByName = new LinkedHashMap<>();

	protected ModificationProcessingStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PACK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ModificationProcessingStatus1Code";
				definition = "Specifies the status of a cancellation request.";
				trace_lazy = () -> ModificationProcessingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ModificationProcessingStatus1Code.Accepted, com.tools20022.repository.codeset.ModificationProcessingStatus1Code.Rejected,
						com.tools20022.repository.codeset.ModificationProcessingStatus1Code.Completed, com.tools20022.repository.codeset.ModificationProcessingStatus1Code.Denied,
						com.tools20022.repository.codeset.ModificationProcessingStatus1Code.Pending, com.tools20022.repository.codeset.ModificationProcessingStatus1Code.InRepair);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Completed.getCodeName().get(), Completed);
		codesByName.put(Denied.getCodeName().get(), Denied);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(InRepair.getCodeName().get(), InRepair);
	}

	public static ModificationProcessingStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ModificationProcessingStatus1Code[] values() {
		ModificationProcessingStatus1Code[] values = new ModificationProcessingStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ModificationProcessingStatus1Code> {
		@Override
		public ModificationProcessingStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ModificationProcessingStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}