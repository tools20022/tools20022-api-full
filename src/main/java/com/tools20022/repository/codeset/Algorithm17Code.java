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
import com.tools20022.repository.codeset.Algorithm17Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cryptographic algorithms for the MAC (Message Authentication Code).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#RetailCBCMAC
 * Algorithm17Code.RetailCBCMAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#RetailSHA256MAC
 * Algorithm17Code.RetailSHA256MAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#SHA256CMACwithAES128
 * Algorithm17Code.SHA256CMACwithAES128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#RetailSHA1MAC
 * Algorithm17Code.RetailSHA1MAC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#SHA384CMACwithAES192
 * Algorithm17Code.SHA384CMACwithAES192}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#SHA512CMACwithAES256
 * Algorithm17Code.SHA512CMACwithAES256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#SHA256CMACWithAES256
 * Algorithm17Code.SHA256CMACWithAES256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#SHA3256CMACWithAES128
 * Algorithm17Code.SHA3256CMACWithAES128}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#SHA3384CMACWithAES192
 * Algorithm17Code.SHA3384CMACWithAES192}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#SHA3512CMACWithAES256
 * Algorithm17Code.SHA3512CMACWithAES256}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code#SHA32563DESMAC
 * Algorithm17Code.SHA32563DESMAC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm17Code#CMACAES128
 * Algorithm17Code.CMACAES128}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm17Code#CMACAES192
 * Algorithm17Code.CMACAES192}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm17Code#CMACAES256
 * Algorithm17Code.CMACAES256}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode AlgorithmCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MACC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Algorithm17Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cryptographic algorithms for the MAC (Message Authentication Code)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code
 * Algorithm12Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Algorithm17Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailCBCMAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#RetailCBCMAC
	 * Algorithm12Code.RetailCBCMAC}</li>
	 * </ul>
	 */
	public static final Algorithm17Code RetailCBCMAC = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailCBCMAC";
			previousVersion_lazy = () -> Algorithm12Code.RetailCBCMAC;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.RetailCBCMAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailSHA256MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#RetailSHA256MAC
	 * Algorithm12Code.RetailSHA256MAC}</li>
	 * </ul>
	 */
	public static final Algorithm17Code RetailSHA256MAC = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailSHA256MAC";
			previousVersion_lazy = () -> Algorithm12Code.RetailSHA256MAC;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.RetailSHA256MAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256CMACwithAES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#SHA256CMACwithAES128
	 * Algorithm12Code.SHA256CMACwithAES128}</li>
	 * </ul>
	 */
	public static final Algorithm17Code SHA256CMACwithAES128 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA256CMACwithAES128";
			previousVersion_lazy = () -> Algorithm12Code.SHA256CMACwithAES128;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.SHA256CMACwithAES128.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailSHA1MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#RetailSHA1MAC
	 * Algorithm12Code.RetailSHA1MAC}</li>
	 * </ul>
	 */
	public static final Algorithm17Code RetailSHA1MAC = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetailSHA1MAC";
			previousVersion_lazy = () -> Algorithm12Code.RetailSHA1MAC;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.RetailSHA1MAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA384CMACwithAES192"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#SHA384CMACwithAES192
	 * Algorithm12Code.SHA384CMACwithAES192}</li>
	 * </ul>
	 */
	public static final Algorithm17Code SHA384CMACwithAES192 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA384CMACwithAES192";
			previousVersion_lazy = () -> Algorithm12Code.SHA384CMACwithAES192;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.SHA384CMACwithAES192.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA512CMACwithAES256"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code#SHA512CMACwithAES256
	 * Algorithm12Code.SHA512CMACwithAES256}</li>
	 * </ul>
	 */
	public static final Algorithm17Code SHA512CMACwithAES256 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA512CMACwithAES256";
			previousVersion_lazy = () -> Algorithm12Code.SHA512CMACwithAES256;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.SHA512CMACwithAES256.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA256CMACWithAES256"</li>
	 * </ul>
	 */
	public static final Algorithm17Code SHA256CMACWithAES256 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA256CMACWithAES256";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.SHA256CMACWithAES256.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-256CMACWithAES128"</li>
	 * </ul>
	 */
	public static final Algorithm17Code SHA3256CMACWithAES128 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-256CMACWithAES128";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.SHA3256CMACWithAES128.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-384CMACWithAES192"</li>
	 * </ul>
	 */
	public static final Algorithm17Code SHA3384CMACWithAES192 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-384CMACWithAES192";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.SHA3384CMACWithAES192.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-512CMACWithAES256"</li>
	 * </ul>
	 */
	public static final Algorithm17Code SHA3512CMACWithAES256 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-512CMACWithAES256";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.SHA3512CMACWithAES256.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SHA3-256-3DESMAC"</li>
	 * </ul>
	 */
	public static final Algorithm17Code SHA32563DESMAC = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SHA3-256-3DESMAC";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.SHA32563DESMAC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMACAES128"</li>
	 * </ul>
	 */
	public static final Algorithm17Code CMACAES128 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMACAES128";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.CMACAES128.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMACAES192"</li>
	 * </ul>
	 */
	public static final Algorithm17Code CMACAES192 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMACAES192";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.CMACAES192.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm17Code
	 * Algorithm17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMACAES256"</li>
	 * </ul>
	 */
	public static final Algorithm17Code CMACAES256 = new Algorithm17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMACAES256";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm17Code.mmObject();
			codeName = AlgorithmCode.CMACAES256.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Algorithm17Code> codesByName = new LinkedHashMap<>();

	protected Algorithm17Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MACC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm17Code";
				definition = "Cryptographic algorithms for the MAC (Message Authentication Code).";
				previousVersion_lazy = () -> Algorithm12Code.mmObject();
				trace_lazy = () -> AlgorithmCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Algorithm17Code.RetailCBCMAC, com.tools20022.repository.codeset.Algorithm17Code.RetailSHA256MAC,
						com.tools20022.repository.codeset.Algorithm17Code.SHA256CMACwithAES128, com.tools20022.repository.codeset.Algorithm17Code.RetailSHA1MAC, com.tools20022.repository.codeset.Algorithm17Code.SHA384CMACwithAES192,
						com.tools20022.repository.codeset.Algorithm17Code.SHA512CMACwithAES256, com.tools20022.repository.codeset.Algorithm17Code.SHA256CMACWithAES256,
						com.tools20022.repository.codeset.Algorithm17Code.SHA3256CMACWithAES128, com.tools20022.repository.codeset.Algorithm17Code.SHA3384CMACWithAES192,
						com.tools20022.repository.codeset.Algorithm17Code.SHA3512CMACWithAES256, com.tools20022.repository.codeset.Algorithm17Code.SHA32563DESMAC, com.tools20022.repository.codeset.Algorithm17Code.CMACAES128,
						com.tools20022.repository.codeset.Algorithm17Code.CMACAES192, com.tools20022.repository.codeset.Algorithm17Code.CMACAES256);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RetailCBCMAC.getCodeName().get(), RetailCBCMAC);
		codesByName.put(RetailSHA256MAC.getCodeName().get(), RetailSHA256MAC);
		codesByName.put(SHA256CMACwithAES128.getCodeName().get(), SHA256CMACwithAES128);
		codesByName.put(RetailSHA1MAC.getCodeName().get(), RetailSHA1MAC);
		codesByName.put(SHA384CMACwithAES192.getCodeName().get(), SHA384CMACwithAES192);
		codesByName.put(SHA512CMACwithAES256.getCodeName().get(), SHA512CMACwithAES256);
		codesByName.put(SHA256CMACWithAES256.getCodeName().get(), SHA256CMACWithAES256);
		codesByName.put(SHA3256CMACWithAES128.getCodeName().get(), SHA3256CMACWithAES128);
		codesByName.put(SHA3384CMACWithAES192.getCodeName().get(), SHA3384CMACWithAES192);
		codesByName.put(SHA3512CMACWithAES256.getCodeName().get(), SHA3512CMACWithAES256);
		codesByName.put(SHA32563DESMAC.getCodeName().get(), SHA32563DESMAC);
		codesByName.put(CMACAES128.getCodeName().get(), CMACAES128);
		codesByName.put(CMACAES192.getCodeName().get(), CMACAES192);
		codesByName.put(CMACAES256.getCodeName().get(), CMACAES256);
	}

	public static Algorithm17Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Algorithm17Code[] values() {
		Algorithm17Code[] values = new Algorithm17Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Algorithm17Code> {
		@Override
		public Algorithm17Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Algorithm17Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}