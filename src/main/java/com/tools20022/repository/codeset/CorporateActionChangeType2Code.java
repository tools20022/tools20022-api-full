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
import com.tools20022.repository.codeset.CorporateActionChangeType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of changes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#BearToRegistered
 * CorporateActionChangeType2Code.BearToRegistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#Certificates
 * CorporateActionChangeType2Code.Certificates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#DematerialisedToPhysical
 * CorporateActionChangeType2Code.DematerialisedToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#GlobalPermanentToPhysical
 * CorporateActionChangeType2Code.GlobalPermanentToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#GlobalTemporaryToGlobalPermanent
 * CorporateActionChangeType2Code.GlobalTemporaryToGlobalPermanent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#GlobalTemporaryToPhysical
 * CorporateActionChangeType2Code.GlobalTemporaryToPhysical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#Name
 * CorporateActionChangeType2Code.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#PhysicalToDematerialised
 * CorporateActionChangeType2Code.PhysicalToDematerialised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#RegisteredToBearer
 * CorporateActionChangeType2Code.RegisteredToBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code#Terms
 * CorporateActionChangeType2Code.Terms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeTypeCode
 * CorporateActionChangeTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BERE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionChangeType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of changes."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionChangeType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BearToRegistered"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code BearToRegistered = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BearToRegistered";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.BearToRegistered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificates"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code Certificates = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificates";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.Certificates.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedToPhysical"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code DematerialisedToPhysical = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DematerialisedToPhysical";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.DematerialisedToPhysical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalPermanentToPhysical"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code GlobalPermanentToPhysical = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalPermanentToPhysical";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.GlobalPermanentToPhysical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalTemporaryToGlobalPermanent"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code GlobalTemporaryToGlobalPermanent = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalTemporaryToGlobalPermanent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.GlobalTemporaryToGlobalPermanent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalTemporaryToPhysical"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code GlobalTemporaryToPhysical = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalTemporaryToPhysical";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.GlobalTemporaryToPhysical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code Name = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.Name.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalToDematerialised"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code PhysicalToDematerialised = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalToDematerialised";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.PhysicalToDematerialised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredToBearer"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code RegisteredToBearer = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredToBearer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.RegisteredToBearer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionChangeType2Code
	 * CorporateActionChangeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terms"</li>
	 * </ul>
	 */
	public static final CorporateActionChangeType2Code Terms = new CorporateActionChangeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Terms";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionChangeType2Code.mmObject();
			codeName = CorporateActionChangeTypeCode.Terms.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionChangeType2Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionChangeType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BERE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionChangeType2Code";
				definition = "Specifies the type of changes.";
				trace_lazy = () -> CorporateActionChangeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionChangeType2Code.BearToRegistered, com.tools20022.repository.codeset.CorporateActionChangeType2Code.Certificates,
						com.tools20022.repository.codeset.CorporateActionChangeType2Code.DematerialisedToPhysical, com.tools20022.repository.codeset.CorporateActionChangeType2Code.GlobalPermanentToPhysical,
						com.tools20022.repository.codeset.CorporateActionChangeType2Code.GlobalTemporaryToGlobalPermanent, com.tools20022.repository.codeset.CorporateActionChangeType2Code.GlobalTemporaryToPhysical,
						com.tools20022.repository.codeset.CorporateActionChangeType2Code.Name, com.tools20022.repository.codeset.CorporateActionChangeType2Code.PhysicalToDematerialised,
						com.tools20022.repository.codeset.CorporateActionChangeType2Code.RegisteredToBearer, com.tools20022.repository.codeset.CorporateActionChangeType2Code.Terms);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BearToRegistered.getCodeName().get(), BearToRegistered);
		codesByName.put(Certificates.getCodeName().get(), Certificates);
		codesByName.put(DematerialisedToPhysical.getCodeName().get(), DematerialisedToPhysical);
		codesByName.put(GlobalPermanentToPhysical.getCodeName().get(), GlobalPermanentToPhysical);
		codesByName.put(GlobalTemporaryToGlobalPermanent.getCodeName().get(), GlobalTemporaryToGlobalPermanent);
		codesByName.put(GlobalTemporaryToPhysical.getCodeName().get(), GlobalTemporaryToPhysical);
		codesByName.put(Name.getCodeName().get(), Name);
		codesByName.put(PhysicalToDematerialised.getCodeName().get(), PhysicalToDematerialised);
		codesByName.put(RegisteredToBearer.getCodeName().get(), RegisteredToBearer);
		codesByName.put(Terms.getCodeName().get(), Terms);
	}

	public static CorporateActionChangeType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionChangeType2Code[] values() {
		CorporateActionChangeType2Code[] values = new CorporateActionChangeType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionChangeType2Code> {
		@Override
		public CorporateActionChangeType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionChangeType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}