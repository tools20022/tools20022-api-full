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
import com.tools20022.repository.codeset.IdentificationType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the source of the leg identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationType2Code#CDC
 * IdentificationType2Code.CDC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationType2Code#CFETS
 * IdentificationType2Code.CFETS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationType2Code#RICCode
 * IdentificationType2Code.RICCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IdentificationType2Code#UserDefined
 * IdentificationType2Code.UserDefined}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IdentificationTypeCode
 * IdentificationTypeCode}</li>
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
 * "IdentificationType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the source of the leg identification."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IdentificationType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationType2Code
	 * IdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CDC"</li>
	 * </ul>
	 */
	public static final IdentificationType2Code CDC = new IdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CDC";
			owner_lazy = () -> com.tools20022.repository.codeset.IdentificationType2Code.mmObject();
			codeName = IdentificationTypeCode.CDC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationType2Code
	 * IdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CFETS"</li>
	 * </ul>
	 */
	public static final IdentificationType2Code CFETS = new IdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CFETS";
			owner_lazy = () -> com.tools20022.repository.codeset.IdentificationType2Code.mmObject();
			codeName = IdentificationTypeCode.CFETS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationType2Code
	 * IdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RICCode"</li>
	 * </ul>
	 */
	public static final IdentificationType2Code RICCode = new IdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RICCode";
			owner_lazy = () -> com.tools20022.repository.codeset.IdentificationType2Code.mmObject();
			codeName = IdentificationTypeCode.RICCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IdentificationType2Code
	 * IdentificationType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefined"</li>
	 * </ul>
	 */
	public static final IdentificationType2Code UserDefined = new IdentificationType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefined";
			owner_lazy = () -> com.tools20022.repository.codeset.IdentificationType2Code.mmObject();
			codeName = IdentificationTypeCode.UserDefined.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, IdentificationType2Code> codesByName = new LinkedHashMap<>();

	protected IdentificationType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationType2Code";
				definition = "Indicates the source of the leg identification.";
				trace_lazy = () -> IdentificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IdentificationType2Code.CDC, com.tools20022.repository.codeset.IdentificationType2Code.CFETS,
						com.tools20022.repository.codeset.IdentificationType2Code.RICCode, com.tools20022.repository.codeset.IdentificationType2Code.UserDefined);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CDC.getCodeName().get(), CDC);
		codesByName.put(CFETS.getCodeName().get(), CFETS);
		codesByName.put(RICCode.getCodeName().get(), RICCode);
		codesByName.put(UserDefined.getCodeName().get(), UserDefined);
	}

	public static IdentificationType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IdentificationType2Code[] values() {
		IdentificationType2Code[] values = new IdentificationType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IdentificationType2Code> {
		@Override
		public IdentificationType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IdentificationType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}