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
import com.tools20022.repository.codeset.PhysicalTransferType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the asset delivery type when the financial instrument is settled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code#Physical
 * PhysicalTransferType4Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code#Optional
 * PhysicalTransferType4Code.Optional}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code#Cash
 * PhysicalTransferType4Code.Cash}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeV2Code
 * PhysicalTransferTypeV2Code}</li>
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
 * "PhysicalTransferType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the asset delivery type when the financial instrument is settled."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PhysicalTransferType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code
	 * PhysicalTransferType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final PhysicalTransferType4Code Physical = new PhysicalTransferType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferType4Code.mmObject();
			codeName = PhysicalTransferTypeV2Code.Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code
	 * PhysicalTransferType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Optional"</li>
	 * </ul>
	 */
	public static final PhysicalTransferType4Code Optional = new PhysicalTransferType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Optional";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferType4Code.mmObject();
			codeName = PhysicalTransferTypeV2Code.Optional.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferType4Code
	 * PhysicalTransferType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final PhysicalTransferType4Code Cash = new PhysicalTransferType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.PhysicalTransferType4Code.mmObject();
			codeName = PhysicalTransferTypeV2Code.Cash.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PhysicalTransferType4Code> codesByName = new LinkedHashMap<>();

	protected PhysicalTransferType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PhysicalTransferType4Code";
				definition = "Specifies the asset delivery type when the financial instrument is settled.";
				trace_lazy = () -> PhysicalTransferTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PhysicalTransferType4Code.Physical, com.tools20022.repository.codeset.PhysicalTransferType4Code.Optional,
						com.tools20022.repository.codeset.PhysicalTransferType4Code.Cash);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(Optional.getCodeName().get(), Optional);
		codesByName.put(Cash.getCodeName().get(), Cash);
	}

	public static PhysicalTransferType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PhysicalTransferType4Code[] values() {
		PhysicalTransferType4Code[] values = new PhysicalTransferType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PhysicalTransferType4Code> {
		@Override
		public PhysicalTransferType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PhysicalTransferType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}