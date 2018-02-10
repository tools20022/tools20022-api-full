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
import com.tools20022.repository.codeset.PINFormat4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Format of an ATM PIN block before encryption.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#ANSI0
 * PINFormat4Code.ANSI0}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#Bancomat
 * PINFormat4Code.Bancomat}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#Banksys
 * PINFormat4Code.Banksys}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#Diebold
 * PINFormat4Code.Diebold}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#DieboldCO
 * PINFormat4Code.DieboldCO}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#ECI2
 * PINFormat4Code.ECI2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#ECI3
 * PINFormat4Code.ECI3}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#EMVRSA
 * PINFormat4Code.EMVRSA}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#IBM3624
 * PINFormat4Code.IBM3624}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#ISO0
 * PINFormat4Code.ISO0}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#ISO1
 * PINFormat4Code.ISO1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#ISO2
 * PINFormat4Code.ISO2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#ISO3
 * PINFormat4Code.ISO3}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#ISO4
 * PINFormat4Code.ISO4}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#ISO5
 * PINFormat4Code.ISO5}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#VISA2
 * PINFormat4Code.VISA2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormat4Code#VISA3
 * PINFormat4Code.VISA3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PINFormatCode PINFormatCode}</li>
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
 * "PINFormat4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Format of an ATM PIN block before encryption."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PINFormat4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ANSI0"</li>
	 * </ul>
	 */
	public static final PINFormat4Code ANSI0 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ANSI0";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.ANSI0.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bancomat"</li>
	 * </ul>
	 */
	public static final PINFormat4Code Bancomat = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bancomat";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.Bancomat.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Banksys"</li>
	 * </ul>
	 */
	public static final PINFormat4Code Banksys = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Banksys";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.Banksys.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Diebold"</li>
	 * </ul>
	 */
	public static final PINFormat4Code Diebold = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Diebold";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.Diebold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DieboldCO"</li>
	 * </ul>
	 */
	public static final PINFormat4Code DieboldCO = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DieboldCO";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.DieboldCO.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ECI2"</li>
	 * </ul>
	 */
	public static final PINFormat4Code ECI2 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ECI2";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.ECI2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ECI3"</li>
	 * </ul>
	 */
	public static final PINFormat4Code ECI3 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ECI3";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.ECI3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVRSA"</li>
	 * </ul>
	 */
	public static final PINFormat4Code EMVRSA = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVRSA";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.EMVRSA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBM3624"</li>
	 * </ul>
	 */
	public static final PINFormat4Code IBM3624 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBM3624";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.IBM3624.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO0"</li>
	 * </ul>
	 */
	public static final PINFormat4Code ISO0 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO0";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.ISO0.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO1"</li>
	 * </ul>
	 */
	public static final PINFormat4Code ISO1 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO1";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.ISO1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO2"</li>
	 * </ul>
	 */
	public static final PINFormat4Code ISO2 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO2";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.ISO2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO3"</li>
	 * </ul>
	 */
	public static final PINFormat4Code ISO3 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO3";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.ISO3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO4"</li>
	 * </ul>
	 */
	public static final PINFormat4Code ISO4 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO4";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.ISO4.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO5"</li>
	 * </ul>
	 */
	public static final PINFormat4Code ISO5 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO5";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.ISO5.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VISA2"</li>
	 * </ul>
	 */
	public static final PINFormat4Code VISA2 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VISA2";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.VISA2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VISA3"</li>
	 * </ul>
	 */
	public static final PINFormat4Code VISA3 = new PINFormat4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VISA3";
			owner_lazy = () -> com.tools20022.repository.codeset.PINFormat4Code.mmObject();
			codeName = PINFormatCode.VISA3.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PINFormat4Code> codesByName = new LinkedHashMap<>();

	protected PINFormat4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PINFormat4Code";
				definition = "Format of an ATM PIN block before encryption.";
				trace_lazy = () -> PINFormatCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PINFormat4Code.ANSI0, com.tools20022.repository.codeset.PINFormat4Code.Bancomat, com.tools20022.repository.codeset.PINFormat4Code.Banksys,
						com.tools20022.repository.codeset.PINFormat4Code.Diebold, com.tools20022.repository.codeset.PINFormat4Code.DieboldCO, com.tools20022.repository.codeset.PINFormat4Code.ECI2,
						com.tools20022.repository.codeset.PINFormat4Code.ECI3, com.tools20022.repository.codeset.PINFormat4Code.EMVRSA, com.tools20022.repository.codeset.PINFormat4Code.IBM3624,
						com.tools20022.repository.codeset.PINFormat4Code.ISO0, com.tools20022.repository.codeset.PINFormat4Code.ISO1, com.tools20022.repository.codeset.PINFormat4Code.ISO2,
						com.tools20022.repository.codeset.PINFormat4Code.ISO3, com.tools20022.repository.codeset.PINFormat4Code.ISO4, com.tools20022.repository.codeset.PINFormat4Code.ISO5,
						com.tools20022.repository.codeset.PINFormat4Code.VISA2, com.tools20022.repository.codeset.PINFormat4Code.VISA3);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ANSI0.getCodeName().get(), ANSI0);
		codesByName.put(Bancomat.getCodeName().get(), Bancomat);
		codesByName.put(Banksys.getCodeName().get(), Banksys);
		codesByName.put(Diebold.getCodeName().get(), Diebold);
		codesByName.put(DieboldCO.getCodeName().get(), DieboldCO);
		codesByName.put(ECI2.getCodeName().get(), ECI2);
		codesByName.put(ECI3.getCodeName().get(), ECI3);
		codesByName.put(EMVRSA.getCodeName().get(), EMVRSA);
		codesByName.put(IBM3624.getCodeName().get(), IBM3624);
		codesByName.put(ISO0.getCodeName().get(), ISO0);
		codesByName.put(ISO1.getCodeName().get(), ISO1);
		codesByName.put(ISO2.getCodeName().get(), ISO2);
		codesByName.put(ISO3.getCodeName().get(), ISO3);
		codesByName.put(ISO4.getCodeName().get(), ISO4);
		codesByName.put(ISO5.getCodeName().get(), ISO5);
		codesByName.put(VISA2.getCodeName().get(), VISA2);
		codesByName.put(VISA3.getCodeName().get(), VISA3);
	}

	public static PINFormat4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PINFormat4Code[] values() {
		PINFormat4Code[] values = new PINFormat4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PINFormat4Code> {
		@Override
		public PINFormat4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PINFormat4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}