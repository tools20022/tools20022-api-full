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
import com.tools20022.repository.codeset.AcceptedStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for an accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcceptedStatusReason1Code#PlaceNotAllowed
 * AcceptedStatusReason1Code.PlaceNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcceptedStatusReason1Code#SectorNotAllowed
 * AcceptedStatusReason1Code.SectorNotAllowed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AcceptedStatusReasonCode
 * AcceptedStatusReasonCode}</li>
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
 * "AcceptedStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for an accepted status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AcceptedStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcceptedStatusReason1Code
	 * AcceptedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceNotAllowed"</li>
	 * </ul>
	 */
	public static final AcceptedStatusReason1Code PlaceNotAllowed = new AcceptedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.AcceptedStatusReason1Code.mmObject();
			codeName = AcceptedStatusReasonCode.PlaceNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcceptedStatusReason1Code
	 * AcceptedStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SectorNotAllowed"</li>
	 * </ul>
	 */
	public static final AcceptedStatusReason1Code SectorNotAllowed = new AcceptedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SectorNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.AcceptedStatusReason1Code.mmObject();
			codeName = AcceptedStatusReasonCode.SectorNotAllowed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AcceptedStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected AcceptedStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptedStatusReason1Code";
				definition = "Specifies the reason for an accepted status.";
				trace_lazy = () -> AcceptedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AcceptedStatusReason1Code.PlaceNotAllowed, com.tools20022.repository.codeset.AcceptedStatusReason1Code.SectorNotAllowed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PlaceNotAllowed.getCodeName().get(), PlaceNotAllowed);
		codesByName.put(SectorNotAllowed.getCodeName().get(), SectorNotAllowed);
	}

	public static AcceptedStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AcceptedStatusReason1Code[] values() {
		AcceptedStatusReason1Code[] values = new AcceptedStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AcceptedStatusReason1Code> {
		@Override
		public AcceptedStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AcceptedStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}