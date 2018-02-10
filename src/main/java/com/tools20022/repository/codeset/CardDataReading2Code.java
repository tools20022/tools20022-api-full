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
import com.tools20022.repository.codeset.CardDataReading2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Card reading capabilities of the terminal performing the transaction.<br>
 * It correspond to the ISO 8583, field number 22-2 for the version 93, and 27-1
 * for the version 2003.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code#AccountData
 * CardDataReading2Code.AccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code#BarCode
 * CardDataReading2Code.BarCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code#CardOnFile
 * CardDataReading2Code.CardOnFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code#EMVProximityReader
 * CardDataReading2Code.EMVProximityReader}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading2Code#ICC
 * CardDataReading2Code.ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code#MagneticStripe
 * CardDataReading2Code.MagneticStripe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code#Physical
 * CardDataReading2Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code#ProximityReader
 * CardDataReading2Code.ProximityReader}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading2Code#Tag
 * CardDataReading2Code.Tag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code#Unknown
 * CardDataReading2Code.Unknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
 * CardDataReadingCode}</li>
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
 * "CardDataReading2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card reading capabilities of the terminal performing the transaction.\r\nIt correspond to the ISO 8583, field number 22-2 for the version 93, and 27-1 for the version 2003."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardDataReading2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code AccountData = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.AccountData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarCode"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code BarCode = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BarCode";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.BarCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardOnFile"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code CardOnFile = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardOnFile";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.CardOnFile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVProximityReader"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code EMVProximityReader = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVProximityReader";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.EMVProximityReader.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code ICC = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICC";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.ICC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MagneticStripe"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code MagneticStripe = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MagneticStripe";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.MagneticStripe.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code Physical = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.Physical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProximityReader"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code ProximityReader = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProximityReader";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.ProximityReader.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tag"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code Tag = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tag";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.Tag.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final CardDataReading2Code Unknown = new CardDataReading2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.CardDataReading2Code.mmObject();
			codeName = CardDataReadingCode.Unknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardDataReading2Code> codesByName = new LinkedHashMap<>();

	protected CardDataReading2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardDataReading2Code";
				definition = "Card reading capabilities of the terminal performing the transaction.\r\nIt correspond to the ISO 8583, field number 22-2 for the version 93, and 27-1 for the version 2003.";
				trace_lazy = () -> CardDataReadingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardDataReading2Code.AccountData, com.tools20022.repository.codeset.CardDataReading2Code.BarCode,
						com.tools20022.repository.codeset.CardDataReading2Code.CardOnFile, com.tools20022.repository.codeset.CardDataReading2Code.EMVProximityReader, com.tools20022.repository.codeset.CardDataReading2Code.ICC,
						com.tools20022.repository.codeset.CardDataReading2Code.MagneticStripe, com.tools20022.repository.codeset.CardDataReading2Code.Physical, com.tools20022.repository.codeset.CardDataReading2Code.ProximityReader,
						com.tools20022.repository.codeset.CardDataReading2Code.Tag, com.tools20022.repository.codeset.CardDataReading2Code.Unknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountData.getCodeName().get(), AccountData);
		codesByName.put(BarCode.getCodeName().get(), BarCode);
		codesByName.put(CardOnFile.getCodeName().get(), CardOnFile);
		codesByName.put(EMVProximityReader.getCodeName().get(), EMVProximityReader);
		codesByName.put(ICC.getCodeName().get(), ICC);
		codesByName.put(MagneticStripe.getCodeName().get(), MagneticStripe);
		codesByName.put(Physical.getCodeName().get(), Physical);
		codesByName.put(ProximityReader.getCodeName().get(), ProximityReader);
		codesByName.put(Tag.getCodeName().get(), Tag);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
	}

	public static CardDataReading2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardDataReading2Code[] values() {
		CardDataReading2Code[] values = new CardDataReading2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardDataReading2Code> {
		@Override
		public CardDataReading2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardDataReading2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}