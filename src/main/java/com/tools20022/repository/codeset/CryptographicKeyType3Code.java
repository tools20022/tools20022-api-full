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
import com.tools20022.repository.codeset.CryptographicKeyType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Codes for qualifying the type of cryptographic keys.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code#AES128
 * CryptographicKeyType3Code.AES128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code#DES112
 * CryptographicKeyType3Code.DES112}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code#DUKPT2009
 * CryptographicKeyType3Code.DUKPT2009}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code#AES192
 * CryptographicKeyType3Code.AES192}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code#AES256
 * CryptographicKeyType3Code.AES256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code#DES168
 * CryptographicKeyType3Code.DES168}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyTypeCode
 * CryptographicKeyTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AES2"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CryptographicKeyType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Codes for qualifying the type of cryptographic keys."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType2Code
 * CryptographicKeyType2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CryptographicKeyType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType2Code#AES128
	 * CryptographicKeyType2Code.AES128}</li>
	 * </ul>
	 */
	public static final CryptographicKeyType3Code AES128 = new CryptographicKeyType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES128";
			previousVersion_lazy = () -> CryptographicKeyType2Code.AES128;
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType3Code.mmObject();
			codeName = CryptographicKeyTypeCode.AES128.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES112"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType2Code#DES112
	 * CryptographicKeyType2Code.DES112}</li>
	 * </ul>
	 */
	public static final CryptographicKeyType3Code DES112 = new CryptographicKeyType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES112";
			previousVersion_lazy = () -> CryptographicKeyType2Code.DES112;
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType3Code.mmObject();
			codeName = CryptographicKeyTypeCode.DES112.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT2009"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType2Code#DUKPT2009
	 * CryptographicKeyType2Code.DUKPT2009}</li>
	 * </ul>
	 */
	public static final CryptographicKeyType3Code DUKPT2009 = new CryptographicKeyType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DUKPT2009";
			previousVersion_lazy = () -> CryptographicKeyType2Code.DUKPT2009;
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType3Code.mmObject();
			codeName = CryptographicKeyTypeCode.DUKPT2009.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES192"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType3Code AES192 = new CryptographicKeyType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES192";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType3Code.mmObject();
			codeName = CryptographicKeyTypeCode.AES192.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES256"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType3Code AES256 = new CryptographicKeyType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES256";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType3Code.mmObject();
			codeName = CryptographicKeyTypeCode.AES256.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES168"</li>
	 * </ul>
	 */
	public static final CryptographicKeyType3Code DES168 = new CryptographicKeyType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES168";
			owner_lazy = () -> com.tools20022.repository.codeset.CryptographicKeyType3Code.mmObject();
			codeName = CryptographicKeyTypeCode.DES168.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CryptographicKeyType3Code> codesByName = new LinkedHashMap<>();

	protected CryptographicKeyType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AES2");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CryptographicKeyType3Code";
				definition = "Codes for qualifying the type of cryptographic keys.";
				previousVersion_lazy = () -> CryptographicKeyType2Code.mmObject();
				trace_lazy = () -> CryptographicKeyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CryptographicKeyType3Code.AES128, com.tools20022.repository.codeset.CryptographicKeyType3Code.DES112,
						com.tools20022.repository.codeset.CryptographicKeyType3Code.DUKPT2009, com.tools20022.repository.codeset.CryptographicKeyType3Code.AES192, com.tools20022.repository.codeset.CryptographicKeyType3Code.AES256,
						com.tools20022.repository.codeset.CryptographicKeyType3Code.DES168);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AES128.getCodeName().get(), AES128);
		codesByName.put(DES112.getCodeName().get(), DES112);
		codesByName.put(DUKPT2009.getCodeName().get(), DUKPT2009);
		codesByName.put(AES192.getCodeName().get(), AES192);
		codesByName.put(AES256.getCodeName().get(), AES256);
		codesByName.put(DES168.getCodeName().get(), DES168);
	}

	public static CryptographicKeyType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CryptographicKeyType3Code[] values() {
		CryptographicKeyType3Code[] values = new CryptographicKeyType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CryptographicKeyType3Code> {
		@Override
		public CryptographicKeyType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CryptographicKeyType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}