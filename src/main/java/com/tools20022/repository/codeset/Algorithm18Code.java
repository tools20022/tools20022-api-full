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
import com.tools20022.repository.codeset.Algorithm18Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Cryptographic algorithms for the protection of transported keys.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#AES128CBC
 * Algorithm18Code.AES128CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#DES112CBC
 * Algorithm18Code.DES112CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#DUKPT2009
 * Algorithm18Code.DUKPT2009}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#UKPT
 * Algorithm18Code.UKPT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code#UKPTwithAES128
 * Algorithm18Code.UKPTwithAES128}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#AES192CBC
 * Algorithm18Code.AES192CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#AES256CBC
 * Algorithm18Code.AES256CBC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code#AESDUKPT128ECB
 * Algorithm18Code.AESDUKPT128ECB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code#AESDUKPT192ECB
 * Algorithm18Code.AESDUKPT192ECB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code#AESDUKPT256ECB
 * Algorithm18Code.AESDUKPT256ECB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code#Nist800108KeyDerivation
 * Algorithm18Code.Nist800108KeyDerivation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#AES256CTR
 * Algorithm18Code.AES256CTR}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#AES192CTR
 * Algorithm18Code.AES192CTR}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#AES128CTR
 * Algorithm18Code.AES128CTR}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#DES112CTR
 * Algorithm18Code.DES112CTR}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#DES168CBC
 * Algorithm18Code.DES168CBC}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#DES168CTR
 * Algorithm18Code.DES168CTR}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Algorithm18Code#SDE056CBC
 * Algorithm18Code.SDE056CBC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AlgorithmCode AlgorithmCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Algorithm18Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cryptographic algorithms for the protection of transported keys."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EA2C"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.Algorithm13Code
 * Algorithm13Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Algorithm18Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES128CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm13Code#AES128CBC
	 * Algorithm13Code.AES128CBC}</li>
	 * </ul>
	 */
	public static final Algorithm18Code AES128CBC = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES128CBC";
			previousVersion_lazy = () -> Algorithm13Code.AES128CBC;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.AES128CBC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES112CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm13Code#DES112CBC
	 * Algorithm13Code.DES112CBC}</li>
	 * </ul>
	 */
	public static final Algorithm18Code DES112CBC = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES112CBC";
			previousVersion_lazy = () -> Algorithm13Code.DES112CBC;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.DES112CBC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUKPT2009"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm13Code#DUKPT2009
	 * Algorithm13Code.DUKPT2009}</li>
	 * </ul>
	 */
	public static final Algorithm18Code DUKPT2009 = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DUKPT2009";
			previousVersion_lazy = () -> Algorithm13Code.DUKPT2009;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.DUKPT2009.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm13Code#UKPT
	 * Algorithm13Code.UKPT}</li>
	 * </ul>
	 */
	public static final Algorithm18Code UKPT = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKPT";
			previousVersion_lazy = () -> Algorithm13Code.UKPT;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.UKPT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKPTwithAES128"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm13Code#UKPTwithAES128
	 * Algorithm13Code.UKPTwithAES128}</li>
	 * </ul>
	 */
	public static final Algorithm18Code UKPTwithAES128 = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKPTwithAES128";
			previousVersion_lazy = () -> Algorithm13Code.UKPTwithAES128;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.UKPTwithAES128.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES192CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm13Code#AES192CBC
	 * Algorithm13Code.AES192CBC}</li>
	 * </ul>
	 */
	public static final Algorithm18Code AES192CBC = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES192CBC";
			previousVersion_lazy = () -> Algorithm13Code.AES192CBC;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.AES192CBC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES256CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm13Code#AES256CBC
	 * Algorithm13Code.AES256CBC}</li>
	 * </ul>
	 */
	public static final Algorithm18Code AES256CBC = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES256CBC";
			previousVersion_lazy = () -> Algorithm13Code.AES256CBC;
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.AES256CBC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AESDUKPT128ECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code AESDUKPT128ECB = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AESDUKPT128ECB";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.AESDUKPT128ECB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AESDUKPT192ECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code AESDUKPT192ECB = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AESDUKPT192ECB";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.AESDUKPT192ECB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AESDUKPT256ECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code AESDUKPT256ECB = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AESDUKPT256ECB";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.AESDUKPT256ECB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nist800-108KeyDerivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code Nist800108KeyDerivation = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nist800-108KeyDerivation";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.Nist800108KeyDerivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES256CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code AES256CTR = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES256CTR";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.AES256CTR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES192CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code AES192CTR = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES192CTR";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.AES192CTR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AES128CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code AES128CTR = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AES128CTR";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.AES128CTR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES112CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code DES112CTR = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES112CTR";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.DES112CTR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES168CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code DES168CBC = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES168CBC";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.DES168CBC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DES168CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code DES168CTR = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DES168CTR";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.DES168CTR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm18Code
	 * Algorithm18Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SDE056CBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final Algorithm18Code SDE056CBC = new Algorithm18Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SDE056CBC";
			owner_lazy = () -> com.tools20022.repository.codeset.Algorithm18Code.mmObject();
			codeName = AlgorithmCode.SDE056CBC.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Algorithm18Code> codesByName = new LinkedHashMap<>();

	protected Algorithm18Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EA2C");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Algorithm18Code";
				definition = "Cryptographic algorithms for the protection of transported keys.";
				previousVersion_lazy = () -> Algorithm13Code.mmObject();
				trace_lazy = () -> AlgorithmCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Algorithm18Code.AES128CBC, com.tools20022.repository.codeset.Algorithm18Code.DES112CBC, com.tools20022.repository.codeset.Algorithm18Code.DUKPT2009,
						com.tools20022.repository.codeset.Algorithm18Code.UKPT, com.tools20022.repository.codeset.Algorithm18Code.UKPTwithAES128, com.tools20022.repository.codeset.Algorithm18Code.AES192CBC,
						com.tools20022.repository.codeset.Algorithm18Code.AES256CBC, com.tools20022.repository.codeset.Algorithm18Code.AESDUKPT128ECB, com.tools20022.repository.codeset.Algorithm18Code.AESDUKPT192ECB,
						com.tools20022.repository.codeset.Algorithm18Code.AESDUKPT256ECB, com.tools20022.repository.codeset.Algorithm18Code.Nist800108KeyDerivation, com.tools20022.repository.codeset.Algorithm18Code.AES256CTR,
						com.tools20022.repository.codeset.Algorithm18Code.AES192CTR, com.tools20022.repository.codeset.Algorithm18Code.AES128CTR, com.tools20022.repository.codeset.Algorithm18Code.DES112CTR,
						com.tools20022.repository.codeset.Algorithm18Code.DES168CBC, com.tools20022.repository.codeset.Algorithm18Code.DES168CTR, com.tools20022.repository.codeset.Algorithm18Code.SDE056CBC);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AES128CBC.getCodeName().get(), AES128CBC);
		codesByName.put(DES112CBC.getCodeName().get(), DES112CBC);
		codesByName.put(DUKPT2009.getCodeName().get(), DUKPT2009);
		codesByName.put(UKPT.getCodeName().get(), UKPT);
		codesByName.put(UKPTwithAES128.getCodeName().get(), UKPTwithAES128);
		codesByName.put(AES192CBC.getCodeName().get(), AES192CBC);
		codesByName.put(AES256CBC.getCodeName().get(), AES256CBC);
		codesByName.put(AESDUKPT128ECB.getCodeName().get(), AESDUKPT128ECB);
		codesByName.put(AESDUKPT192ECB.getCodeName().get(), AESDUKPT192ECB);
		codesByName.put(AESDUKPT256ECB.getCodeName().get(), AESDUKPT256ECB);
		codesByName.put(Nist800108KeyDerivation.getCodeName().get(), Nist800108KeyDerivation);
		codesByName.put(AES256CTR.getCodeName().get(), AES256CTR);
		codesByName.put(AES192CTR.getCodeName().get(), AES192CTR);
		codesByName.put(AES128CTR.getCodeName().get(), AES128CTR);
		codesByName.put(DES112CTR.getCodeName().get(), DES112CTR);
		codesByName.put(DES168CBC.getCodeName().get(), DES168CBC);
		codesByName.put(DES168CTR.getCodeName().get(), DES168CTR);
		codesByName.put(SDE056CBC.getCodeName().get(), SDE056CBC);
	}

	public static Algorithm18Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Algorithm18Code[] values() {
		Algorithm18Code[] values = new Algorithm18Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Algorithm18Code> {
		@Override
		public Algorithm18Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Algorithm18Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}