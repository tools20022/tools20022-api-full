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
import com.tools20022.repository.codeset.SettlementDate5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the date of settlement, in coded form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#Regular
 * SettlementDate5Code.Regular}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDate5Code#Cash
 * SettlementDate5Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#NextDay
 * SettlementDate5Code.NextDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#TPlusOne
 * SettlementDate5Code.TPlusOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#TPlusTwo
 * SettlementDate5Code.TPlusTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#TPlusThree
 * SettlementDate5Code.TPlusThree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#TPlusFour
 * SettlementDate5Code.TPlusFour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#TPlusFive
 * SettlementDate5Code.TPlusFive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#SellersOption
 * SettlementDate5Code.SellersOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#WhenDistributed
 * SettlementDate5Code.WhenDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#WhenIssuedOrDistributed
 * SettlementDate5Code.WhenIssuedOrDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#ToBeAnnouncedTrade
 * SettlementDate5Code.ToBeAnnouncedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code#WhenIssued
 * SettlementDate5Code.WhenIssued}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
 * SettlementDateCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REGU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDate5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the date of settlement, in coded form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementDate5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code Regular = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.Regular.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code Cash = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextDay"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code NextDay = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextDay";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.NextDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusOne"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code TPlusOne = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusOne";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.TPlusOne.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusTwo"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code TPlusTwo = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusTwo";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.TPlusTwo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusThree"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code TPlusThree = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusThree";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.TPlusThree.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusFour"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code TPlusFour = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusFour";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.TPlusFour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusFive"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code TPlusFive = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TPlusFive";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.TPlusFive.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellersOption"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code SellersOption = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellersOption";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.SellersOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenDistributed"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code WhenDistributed = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenDistributed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.WhenDistributed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenIssuedOrDistributed"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code WhenIssuedOrDistributed = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenIssuedOrDistributed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.WhenIssuedOrDistributed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeAnnouncedTrade"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code ToBeAnnouncedTrade = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeAnnouncedTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.ToBeAnnouncedTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDate5Code
	 * SettlementDate5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenIssued"</li>
	 * </ul>
	 */
	public static final SettlementDate5Code WhenIssued = new SettlementDate5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenIssued";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDate5Code.mmObject();
			codeName = SettlementDateCode.WhenIssued.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementDate5Code> codesByName = new LinkedHashMap<>();

	protected SettlementDate5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REGU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDate5Code";
				definition = "Specifies the date of settlement, in coded form.";
				trace_lazy = () -> SettlementDateCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementDate5Code.Regular, com.tools20022.repository.codeset.SettlementDate5Code.Cash, com.tools20022.repository.codeset.SettlementDate5Code.NextDay,
						com.tools20022.repository.codeset.SettlementDate5Code.TPlusOne, com.tools20022.repository.codeset.SettlementDate5Code.TPlusTwo, com.tools20022.repository.codeset.SettlementDate5Code.TPlusThree,
						com.tools20022.repository.codeset.SettlementDate5Code.TPlusFour, com.tools20022.repository.codeset.SettlementDate5Code.TPlusFive, com.tools20022.repository.codeset.SettlementDate5Code.SellersOption,
						com.tools20022.repository.codeset.SettlementDate5Code.WhenDistributed, com.tools20022.repository.codeset.SettlementDate5Code.WhenIssuedOrDistributed,
						com.tools20022.repository.codeset.SettlementDate5Code.ToBeAnnouncedTrade, com.tools20022.repository.codeset.SettlementDate5Code.WhenIssued);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(NextDay.getCodeName().get(), NextDay);
		codesByName.put(TPlusOne.getCodeName().get(), TPlusOne);
		codesByName.put(TPlusTwo.getCodeName().get(), TPlusTwo);
		codesByName.put(TPlusThree.getCodeName().get(), TPlusThree);
		codesByName.put(TPlusFour.getCodeName().get(), TPlusFour);
		codesByName.put(TPlusFive.getCodeName().get(), TPlusFive);
		codesByName.put(SellersOption.getCodeName().get(), SellersOption);
		codesByName.put(WhenDistributed.getCodeName().get(), WhenDistributed);
		codesByName.put(WhenIssuedOrDistributed.getCodeName().get(), WhenIssuedOrDistributed);
		codesByName.put(ToBeAnnouncedTrade.getCodeName().get(), ToBeAnnouncedTrade);
		codesByName.put(WhenIssued.getCodeName().get(), WhenIssued);
	}

	public static SettlementDate5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementDate5Code[] values() {
		SettlementDate5Code[] values = new SettlementDate5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementDate5Code> {
		@Override
		public SettlementDate5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementDate5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}