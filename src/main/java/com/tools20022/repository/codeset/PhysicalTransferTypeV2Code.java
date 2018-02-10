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
import com.tools20022.repository.codeset.PhysicalTransferTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the financial instrument is to be physically delivered or
 * is a dematerilized transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeV2Code#Physical
 * PhysicalTransferTypeV2Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeV2Code#Dematerialised
 * PhysicalTransferTypeV2Code.Dematerialised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeV2Code#Cash
 * PhysicalTransferTypeV2Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeV2Code#Optional
 * PhysicalTransferTypeV2Code.Optional}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code
 * PhysicalTransferType4Code}</li>
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
 * <li>"PHYS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PhysicalTransferTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the financial instrument is to be physically delivered or is a dematerilized transfer."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PhysicalTransferTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Physical transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeV2Code
	 * PhysicalTransferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical transfer."</li>
	 * </ul>
	 */
	public static final PhysicalTransferTypeV2Code Physical = new PhysicalTransferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			definition = "Physical transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferTypeV2Code.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Dematerialised transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeV2Code
	 * PhysicalTransferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dematerialised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dematerialised transfer."</li>
	 * </ul>
	 */
	public static final PhysicalTransferTypeV2Code Dematerialised = new PhysicalTransferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dematerialised";
			definition = "Dematerialised transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferTypeV2Code.mmObject();
			codeName = "DEMT";
		}
	};
	/**
	 * Cash transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeV2Code
	 * PhysicalTransferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash transfer."</li>
	 * </ul>
	 */
	public static final PhysicalTransferTypeV2Code Cash = new PhysicalTransferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			definition = "Cash transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferTypeV2Code.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Determined by a third party or optional for counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeV2Code
	 * PhysicalTransferTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Optional"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Determined by a third party or optional for counterparty."
	 * </li>
	 * </ul>
	 */
	public static final PhysicalTransferTypeV2Code Optional = new PhysicalTransferTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Optional";
			definition = "Determined by a third party or optional for counterparty.";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferTypeV2Code.mmObject();
			codeName = "OPTL";
		}
	};
	final static private LinkedHashMap<String, PhysicalTransferTypeV2Code> codesByName = new LinkedHashMap<>();

	protected PhysicalTransferTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PHYS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PhysicalTransferTypeV2Code";
				definition = "Specifies whether the financial instrument is to be physically delivered or is a dematerilized transfer.";
				derivation_lazy = () -> Arrays.asList(PhysicalTransferType4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PhysicalTransferTypeV2Code.Physical, com.tools20022.repository.codeset.PhysicalTransferTypeV2Code.Dematerialised,
						com.tools20022.repository.codeset.PhysicalTransferTypeV2Code.Cash, com.tools20022.repository.codeset.PhysicalTransferTypeV2Code.Optional);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(Dematerialised.getCodeName().get(), Dematerialised);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Optional.getCodeName().get(), Optional);
	}

	public static PhysicalTransferTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PhysicalTransferTypeV2Code[] values() {
		PhysicalTransferTypeV2Code[] values = new PhysicalTransferTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PhysicalTransferTypeV2Code> {
		@Override
		public PhysicalTransferTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PhysicalTransferTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}